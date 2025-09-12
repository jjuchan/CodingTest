package programmers.level2;

public class PG_12945 {
    public static void main(String[] args) {

    }

    class Solution {
        static int[] dp = new int[1000001];

        public int solution(int n) {
            dp[0] = 0;
            dp[1] = 1;

            int answer = fibonaci(n);
            return answer;
        }

        public static int fibonaci(int n) {
            for (int i = 2; i <= n; i++) {
                dp[i] = (dp[i - 2] + dp[i - 1]) % 1234567;
            }
            return dp[n];
        }
    }

}
