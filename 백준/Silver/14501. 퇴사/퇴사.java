
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] T = new int[N + 1]; // 상담 기간
        int[] P = new int[N + 1]; // 수익
        int[] dp = new int[N + 2]; // dp[i]: i일까지 최대 수익

        for (int i = 1; i <= N; i++) {
            T[i] = sc.nextInt();
            P[i] = sc.nextInt();
        }

        for (int i = 1; i <= N; i++) {
            // 상담을 하지 않는 경우: 다음 날로 이익을 그대로 넘김
            dp[i + 1] = Math.max(dp[i + 1], dp[i]);

            // 상담을 할 수 있는 경우만: 끝나는 날에 수익 반영
            if (i + T[i] <= N + 1) {
                dp[i + T[i]] = Math.max(dp[i + T[i]], dp[i] + P[i]);
            }
        }

        // 최대 수익 출력
        int max = 0;
        for (int i = 1; i <= N + 1; i++) {
            max = Math.max(max, dp[i]);
        }

        System.out.println(max);
    }
}