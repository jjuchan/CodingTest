package backjon;

import java.io.*;
public class test1788 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[2000000];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= Math.abs(n); i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000000;
        }

        if (n == 0) {
            System.out.println(0);
            System.out.println(dp[0]);
        } else if (n > 0 || (n < 0 && Math.abs(n) % 2 == 1)) {
            System.out.println(1);
            System.out.println(Math.abs(dp[Math.abs(n)]));
        } else {
            System.out.println(-1);
            System.out.println(Math.abs(dp[Math.abs(n)]));
        }
    }
}
