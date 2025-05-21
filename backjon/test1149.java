package backjon;

import java.util.*;
import java.io.*;

public class test1149 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] cost = new int[N +1][3];//집 갯수와 마지막 집의 색

        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            cost[i][0] = Integer.parseInt(st.nextToken()); //r
            cost[i][1] = Integer.parseInt(st.nextToken()); //g
            cost[i][2] = Integer.parseInt(st.nextToken()); //b
        }
        int[][] dp = new int[N + 1][3]; //최소비용

        dp[1][0] = cost[1][0];
        dp[1][1] = cost[1][1];
        dp[1][2] = cost[1][2];

        for (int i = 2; i <= N; i++) {
            dp[i][0] = cost[i][0] + Math.min(dp[i - 1][1], dp[i - 1][2]); //기존 비용에 다른 숫자가 나왔을 때 최소비용을 더해준다.
            dp[i][1] = cost[i][1] + Math.min(dp[i - 1][0], dp[i - 1][2]); //기존 비용에 다른 숫자가 나왔을 때 최소비용을 더해준다.
            dp[i][2] = cost[i][2] + Math.min(dp[i - 1][0], dp[i - 1][1]); //기존 비용에 다른 숫자가 나왔을 때 최소비용을 더해준다.
        }

        int result = Math.min(dp[N][0],Math.min(dp[N][1],dp[N][2]));
        System.out.println(result);
    }
}
// 인접한 집끼리는 다른 색으로 칠해야하고 비용의 최솟값을 구하여라
