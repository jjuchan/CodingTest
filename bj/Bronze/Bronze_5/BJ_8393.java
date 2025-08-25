package bj.Bronze.Bronze_5;

import java.util.Scanner;

public class BJ_8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        for (int i = 1; i <= n; i++) {
            sum += i; //i를 차례대로 더해줌
        } sc.close();
        System.out.println(sum);
    }
}
