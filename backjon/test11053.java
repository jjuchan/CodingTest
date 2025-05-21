package backjon;

import java.util.*;
import java.io.*;

public class test11053 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());

        int[] arr = new int[A];
        int[] dp = new int[A];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < A; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            dp[i] = 1;
        }

        for (int i = 1; i < A; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int max = 0;
        for (int i = 0; i < A; i++) {
            max = Math.max(max, dp[i]);
        }

        System.out.println(max);
    }
}

