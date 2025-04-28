package backjon;

import java.util.Scanner;

public class test1003 {
    static int[] dp0;  // 0이 호출되는 횟수
    static int[] dp1;  // 1이 호출되는 횟수

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 수
        dp0 = new int[41];  // 최대 40까지 구해야 하므로 크기 41
        dp1 = new int[41];  // 최대 40까지 구해야 하므로 크기 41

        // dp 초기화
        dp0[0] = 1;  // 0이 호출되는 횟수 (피보나치 0은 0번 호출)
        dp1[0] = 0;  // 1이 호출되는 횟수
        dp0[1] = 0;  // 0이 호출되는 횟수
        dp1[1] = 1;  // 1이 호출되는 횟수 (피보나치 1은 1번 호출)

        // DP 테이블 채우기
        for (int i = 2; i <= 40; i++) {
            dp0[i] = dp0[i - 1] + dp0[i - 2];  // 피보나치 0이 호출되는 횟수
            dp1[i] = dp1[i - 1] + dp1[i - 2];  // 피보나치 1이 호출되는 횟수
        }

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();  // 피보나치 수 구할 N
            System.out.println(dp0[N] + " " + dp1[N]);  // 출력
        }
    }
}
