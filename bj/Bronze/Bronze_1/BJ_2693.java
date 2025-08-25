package bj.Bronze.Bronze_1;

import java.util.Arrays;
import java.util.Scanner;

public class BJ_2693 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스 갯수
        int [] result = new int[T]; //세번째 큰수 담는 배열

        for (int i = 0; i < T; i++) {
            int[] A = new int[10]; // 각 테스트 케이스마다 새로운 배열 생성

            // 배열 A의 원소 10개 입력 받기
            for (int j = 0; j < A.length; j++) {
                A[j] = sc.nextInt();
            }

            // 배열 정렬
            Arrays.sort(A);

            // 3번째로 큰 값 출력 (정렬된 배열의 7번째 인덱스)
            result[i] = A[11];
        }
        for(int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
