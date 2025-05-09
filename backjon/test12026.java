package backjon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test12026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 받기
        int N = Integer.parseInt(br.readLine());
        String boj = br.readLine();

        // dp 배열: 최소 에너지 저장
        int[] dp = new int[N];
        // 초기값 설정: dp[0]은 0 (첫 번째 위치는 에너지 0)
        for (int i = 0; i < N; i++) {
            dp[i] = Integer.MAX_VALUE;  // 불가능한 값을 초기화
        }
        dp[0] = 0;  // 첫 번째 위치에서 시작

        // B -> O -> J 순서대로 점프하며 최소 에너지 계산
        for (int i = 0; i < N; i++) {
            // B, O, J 순서에 맞춰서 점프 가능 여부를 확인하고 점프 에너지 계산
            if (dp[i] == Integer.MAX_VALUE) continue;  // dp[i]가 갱신되지 않았으면 넘기기

            for (int j = i + 1; j < N; j++) {
                // B -> O, O -> J, J -> B 순서대로 점프 가능
                if (boj.charAt(i) == 'B' && boj.charAt(j) == 'O') {
                    // B -> O 점프 (에너지 = (j - i) ^ 2)
                    dp[j] = Math.min(dp[j], dp[i] + (j - i) * (j - i));
                } else if (boj.charAt(i) == 'O' && boj.charAt(j) == 'J') {
                    // O -> J 점프 (에너지 = (j - i) ^ 2)
                    dp[j] = Math.min(dp[j], dp[i] + (j - i) * (j - i));
                } else if (boj.charAt(i) == 'J' && boj.charAt(j) == 'B') {
                    // J -> B 점프 (에너지 = (j - i) ^ 2)
                    dp[j] = Math.min(dp[j], dp[i] + (j - i) * (j - i));
                }
            }
        }

        // 링크의 집 (N번 보도블록)으로 가는 최소 에너지 출력
        if (dp[N - 1] == Integer.MAX_VALUE) {
            System.out.println(-1);  // 불가능한 경우
        } else {
            System.out.println(dp[N - 1]);  // 최소 에너지
        }
    }
}
