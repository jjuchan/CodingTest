package backjon;

import java.util.Scanner;

public class test2501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 자연수 입력
        int K = sc.nextInt(); // k번째로 작은 수
        int count = 0;

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                count++;
                if (count == K) {
                    System.out.print(i);
                }

            }

        }
        if (count < K) {
            System.out.print("0");
        }
    }
}
