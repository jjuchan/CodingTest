package bj.Silver.Silver_1;

import java.io.*;
public class BJ_10844 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] dp = new int[N + 1][10];

        for (int i = 1; i < 10; i++) {
            dp[1][i] = 1; // 한자리 수 일때는 경우의 수가 1
        }
        for (int i = 2; i <= N; i++) {
            for (int j = 0; j < 10; j++) {
                if (j > 0) {
                    dp[i][j] += dp[i - 1][j - 1];
                }
                if (j < 9) {
                    dp[i][j] += dp[i - 1][j + 1];
                }
                dp[i][j] %= 1000000000;
            }
        }
        long result = 0;
        for (int i = 0; i < 10; i++) {
            result += dp[N][i];
            result %= 1000000000;
        }
        System.out.println(result);
    }
}
