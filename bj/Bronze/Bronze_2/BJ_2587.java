package bj.Bronze.Bronze_2;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class BJ_2587 {
    public static void main(String[] args) throws IOException {
    // 1.평균 2.중앙값
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int [] A = new int[5];
        for (int i = 0; i < 5; i++) {
            A[i] = sc.nextInt();
            sum += A[i];

        }
        Arrays.sort(A);
        System.out.println(sum/5);
        System.out.println(A[2]);
    }
}
