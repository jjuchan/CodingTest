package backjon;

import java.util.Scanner;

public class test1929 {
    public static void main(String[] args) {
        // 소수 구하기: 1을 제외하고 2부터 배수를 지워나가면서 찾기

        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[] arr = new int[N + 1];

        // 0과 1은 소수가 아니므로 0으로 초기화
        arr[0] = arr[1] = 0;

        // 나머지 숫자는 자기 자신으로 초기화
        for (int i = 2; i <= N; i++) {
            arr[i] = i;
        }

        // 소수 배수 지우기
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (arr[i] == 0) { // 소수가 아닌 수는 건너뛰기
                continue;
            }
            // i의 배수를 지운다
            for (int j = i + i; j <= N; j += i) {
                arr[j] = 0; // i의 배수들은 소수가 아니므로 0 처리
            }
        }

        // M부터 N까지 소수 출력
        for (int i = M; i <= N; i++) {
            if (arr[i] != 0) { // 소수만 출력
                System.out.println(arr[i]);
            }
        }
    }
}
