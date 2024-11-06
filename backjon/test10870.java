package backjon;

import java.util.Scanner;

public class test10870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if (n == 0) {
            System.out.println(0); // n이 0일 때는 바로 0 출력
            return;
        } else if (n == 1) {
            System.out.println(1); // n이 1일 때는 바로 1 출력
            return;
        }

        int first = 0;   // 첫 번째 피보나치 수
        int second = 1;  // 두 번째 피보나치 수
        int move = 0;    // 현재 피보나치 수를 저장할 변수

        for (int i = 2; i <= n; i++) {
            move = first + second; // Fn = Fn-1 + Fn-2
            first = second;        // 이전 값 갱신
            second = move;         // 현재 값 갱신
        }
        System.out.println(move); // n번째 피보나치 수 출력
    }
}
