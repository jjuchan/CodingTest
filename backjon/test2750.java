package backjon;

import java.util.Arrays;
import java.util.Scanner;

public class test2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 수의 갯수
        int[] arr = new int[N];

        // 배열에 입력값 저장
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

//        // 버블 정렬
//        for (int i = 0; i < N - 1; i++) {
//            for (int j = i +1; j < N; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    // 두 수를 교환
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }

        // 정렬된 결과 출력
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i] + " ");
        }

        sc.close();
    }
}
