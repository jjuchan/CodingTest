package bj.Bronze.Bronze_2;

import java.util.Scanner;

public class BJ_1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 주어진 수의 갯수
        int count = 0; // 소수의 개수를 셀 변수

        // 수 N개를 입력받고 소수 여부를 확인
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt(); // 수 입력

            // 1은 소수가 아님
            if (a == 1) {
                continue;
            }

            boolean isPrime = true;
            // 2부터 a-1까지 나누어보면서 소수인지 확인
            for (int j = 2; j < a; j++) {
                if (a % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++; // 소수이면 카운트
            }
        }

        // 소수의 개수 출력
        System.out.println(count);
    }
}