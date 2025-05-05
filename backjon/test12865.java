package backjon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test12865 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력 받기 위한 BufferedReader
        StringTokenizer st = new StringTokenizer(br.readLine()); // 한 줄을 공백으로 분리하기 위한 StringTokenizer

        int N = Integer.parseInt(st.nextToken()); // 물건 개수
        int K = Integer.parseInt(st.nextToken()); // 최대 무게

        int[] weight = new int[N]; // 물건의 무게를 저장할 배열 (0번부터 N-1번까지 사용)
        int[] value = new int[N]; // 물건의 가치를 저장할 배열 (0번부터 N-1번까지 사용)

        // 물건의 무게와 가치를 입력 받기
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            weight[i] = Integer.parseInt(st.nextToken()); // 물건의 무게
            value[i] = Integer.parseInt(st.nextToken()); // 물건의 가치
        }

        int[] dp = new int[K + 1]; // dp 배열, dp[j]는 배낭에 무게 j만큼 담을 때 얻을 수 있는 최대 가치
        for (int i = 0; i < N; i++) { // 각 물건에 대해 반복
            for (int j = K; j >= weight[i]; j--) { // j는 최대 무게부터 내려가면서 확인
                // 배낭에 현재 물건을 넣을 경우와 넣지 않을 경우 중 더 큰 가치를 취함
                dp[j] = Math.max(dp[j], dp[j - weight[i]] + value[i]); // 넣을 수 있는 무게에서 현제 물건의 무게를 빼고 그 나머지의 가치를 더해주면 된다.
            }
        }

        System.out.println(dp[K]); // 최대 무게 K일 때 얻을 수 있는 최대 가치 출력
    }
}
