package backjon;

import java.util.Scanner;

public class test10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 바구니 개수
        int M = sc.nextInt(); // 공 교환 횟수

        int[] baskets = new int[N];

        // 바구니 초기화: 각 바구니에는 번호와 동일한 공이 들어있음
        for (int i = 0; i < N; i++) {
            baskets[i] = i + 1; // 1번 바구니에는 1번 공, 2번 바구니에는 2번 공 ...
        }

        // M번 공을 교환
        for (int t = 0; t < M; t++) {
            int i = sc.nextInt() - 1; // 첫 번째 바구니 (인덱스는 0부터 시작하므로 -1)
            int j = sc.nextInt() - 1; // 두 번째 바구니 (인덱스는 0부터 시작하므로 -1)

            // 두 바구니의 공을 교환
            int temp = baskets[i];  // 첫 번째 바구니의 공을 임시 변수에 저장
            baskets[i] = baskets[j]; // 첫 번째 바구니에 두 번째 바구니의 공을 넣음
            baskets[j] = temp;       // 두 번째 바구니에 임시 변수에 저장된 첫 번째 바구니의 공을 넣음
        }

        // 결과 출력
        for (int i = 0; i < N; i++) {
            System.out.print(baskets[i] + " "); // 공을 공백으로 구분해 출력
        }
        System.out.println(); // 출력 후 줄바꿈
    }
}
