package backjon;

import java.util.*;
import java.io.*;

public class test1463 {
    static int[] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //정수 N

        dp = new int[N + 1]; // 1부터 쓴다.
        dp[0] = 0;
        dp[1] = 0; //1을 1로 만드는건 연산이 필요가 없다

        for (int i = 2; i <= N; i++) {
            dp[i] = dp[i-1] + 1; // 전에 있는 횟수에서 1을 더해준게 현재

            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1); // 1씩 증가해서 센 count보다 작으면 넣어준다.
            }
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }
        System.out.println(dp[N]);
    }

}
// X 가 3으로 나눈 나머지가 0이면 3으로 나눈다, 2로 나누어 떨어지면 2로 나눈다, 1을 뺀다.