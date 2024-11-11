package backjon;

import java.util.ArrayList;
import java.util.Scanner;

public class test2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> primes = new ArrayList<>();

        int M = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0;
        int min = Integer.MAX_VALUE;

        sc.close();

        for (int num = M; num <= N; num++) {
            boolean isPrime = true;

            if (num < 2) {
                isPrime = false; // 1은 소수가 아니므로 제외
            } else {
                for (int i = 2; i <= num / 2; i++) { // √num 대신 num/2까지 반복
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                primes.add(num); // 소수 리스트에 추가
                sum += num;      // 합계에 추가
                if (num < min) { // 최솟값 업데이트
                    min = num;
                }
            }
        }

        // 결과 출력
        if (primes.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
