package bj.Bronze.Bronze_5;

import java.util.Scanner;

public class BJ_25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            if (i % 4 == 0) { // 4의 배수일때만 long 출력
                System.out.println("long");

            }
        }
        System.out.println("int");
    }
}
