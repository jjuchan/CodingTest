package bj.Bronze.Bronze_4;

import java.util.Scanner;

public class BJ_2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {//행반복
            for (int k = 1; k <=N-i; k++) {// 공백 반복
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {//별반복
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

