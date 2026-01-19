

import java.util.*;

public class Main {
    static int stair;
    static int[] score;
    static int[] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        stair = sc.nextInt();
        score = new int[stair + 1];
        dp = new int[stair + 1];

        for (int i = 1; i <= stair; i++) {
            score[i] = sc.nextInt();
        }

        if (stair == 1) {
            System.out.println(score[1]);
            return;
        }

        dp[0] = 0;
        dp[1] = score[1];
        dp[2] = score[1] + score[2];

        for (int i = 3; i <= stair; i++) {
            dp[i] = Math.max(dp[i - 2] + score[i], dp[i - 3] + score[i - 1] + score[i]
            ); // 시작점에서 한칸 올라오고 3으로 가는경우와 , 시작점에서 두칸 올라오고 3으로 오는 경우
        }

        System.out.println(dp[stair]);
    }
}
