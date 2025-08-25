package bj.Bronze.Bronze_3;

import java.util.Scanner;

public class BJ_10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 바구니 개수
        int M = sc.nextInt(); // 공을 넣는 횟수

        int[] baskets = new int[N]; // 바구니 배열 초기화

        for (int t = 0; t < M; t++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            // 바구니 i부터 j까지에 공 k를 넣습니다
            for (int index = i - 1; index < j; index++) {
                baskets[index] = k;
            }
        }

        // 결과 출력
        for (int i = 0; i < baskets.length; i++) {
            if (i > 0) {
                System.out.print(" "); // 각 값 사이에 공백을 추가
            }
            System.out.print(baskets[i]);
        }
        System.out.println(); // 줄 바꿈
    }
}
