import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseNum = 1; //테스트 케이스 번호

        while (true) { //입력이 있으면 계속 돌림
            int N = Integer.parseInt(br.readLine());
            if (N == 0) break; // 입력 종료 조건

            int[][] cost = new int[N][3];
            int[][] dp = new int[N][3];

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 3; j++) {
                    cost[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            // 초기화
            dp[0][0] = Integer.MAX_VALUE;           // 시작점 왼쪽은 올 수 없음
            dp[0][1] = cost[0][1];                  // 시작점
            dp[0][2] = cost[0][1] + cost[0][2];     // 오른쪽은 시작 → 오른쪽

            for (int i = 1; i < N; i++) {
                dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][0]) + cost[i][0];
                dp[i][1] = Math.min(Math.min(dp[i][0], dp[i - 1][0]),
                        Math.min(dp[i - 1][1], dp[i - 1][2])) + cost[i][1];
                dp[i][2] = Math.min(dp[i][1], Math.min(dp[i - 1][1], dp[i - 1][2])) + cost[i][2];
            }

            System.out.println(caseNum + ". " + dp[N - 1][1]);
            caseNum++;
        }
    }
}