

import java.util.Scanner;

public class Main {
    static final int MAX = 1000000;
    static boolean[] isNotPrime = new boolean[MAX + 1]; // false면 소수, true면 소수 아님

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] arr = new int[T];

        // 1. 소수 배열 미리 생성
        sieve();

        // 2. 각 테스트 케이스마다 골드바흐 파티션 수 계산
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int count = 0;
            for (int j = 2; j <= N / 2; j++) {
                if (!isNotPrime[j] && !isNotPrime[N - j]) {
                    count++;
                }
            }
            arr[i] = count;
        }

        // 3. 결과 출력
        for (int i = 0; i < T; i++) {
            System.out.println(arr[i]);
        }
    }

    // 소수를 미리 구해서 isNotPrime 배열에 저장
    private static void sieve() {
        isNotPrime[0] = true;
        isNotPrime[1] = true;
        for (int i = 2; i * i <= MAX; i++) {
            if (!isNotPrime[i]) {
                for (int j = i * i; j <= MAX; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }
    }
}
