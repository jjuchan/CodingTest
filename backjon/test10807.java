package backjon;

import java.util.ArrayList;

import java.util.Scanner;

public class test10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 정수 N 입력
        int N = sc.nextInt();
        int[] numbers = new int[N];

        // N개의 정수 입력
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }

        // 찾고자 하는 정수 v 입력
        int v = sc.nextInt();
        int count = 0;

        // 배열에서 v의 개수를 센다.
        for (int i = 0; i < N; i++) {
            if (numbers[i] == v) {
                count++;
            }
        }

        // 결과 출력
        System.out.println(count);

        sc.close();
    }
}





