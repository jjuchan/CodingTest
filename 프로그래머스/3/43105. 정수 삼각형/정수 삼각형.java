class Solution {
    public int solution(int[][] triangle) {
        int n = triangle.length;
        int[][] dp = new int[n][n]; // 합을 넣어둘 배열 생성

        dp[0][0] = triangle[0][0]; // 초기값은 꼭대기의 값

        for (int i = 1; i < n; i++) {
            //맨 왼쪽
            dp[i][0] = dp[i - 1][0] + triangle[i][0];
            for (int j = 1; j < i; j++) {
                dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + triangle[i][j]; // 중간에 있는 값은 전 인덱스의 왼쪽 값과 오른쪽 값중 큰 값으로 설정
            }

            // 맨 오른쪽
            dp[i][i] = dp[i - 1][i - 1] + triangle[i][i];
        }
        int answer = 0;
        for (int i = 0; i < n; i++) {
            answer = Math.max(answer, dp[n - 1][i]); // 최댓값을 갱신
        }
        return answer;
    }
}
