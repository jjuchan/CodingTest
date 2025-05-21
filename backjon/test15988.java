package backjon;

import java.util.*;
import java.io.*;
public class test15988 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        long[] dp = new long[1000001];

        long[] result = new long[T];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for (int i = 4; i < dp.length; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2] + dp[i - 3]) %  1000000009;
        }

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            result[i] = dp[n];
        }
        for (long a : result) {
            System.out.println(a);
        }
    }
}
