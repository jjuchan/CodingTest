package bj.Bronze.Bronze_5;

import java.util.Scanner;

public class BJ_11382 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();   //문제 범위가 10의 12 제곱까지 였기 때문에
        long b = sc.nextLong();
        long c = sc.nextLong();

        System.out.println(a+b+c);

        sc.close();
    }
}
