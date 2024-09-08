package backjon;

import java.util.Scanner;

public class test10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int arr[] = new int[N];
        for (int i = 0; i < N; i++) { // 바구니 생성
            arr[i] = i + 1; //인덱스 0에 1을 넣어야하기 때문에 1더하기

        }
        for (int k = 0; k < M; k++) {
            int i = sc.nextInt()-1; // 바구니 번호 1번 바구니가 0번 인덱스 이니 -1
            int j = sc.nextInt()-1;

            while (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++; //오른쪽으로 이동
                j--; //왼쪽 이동
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
