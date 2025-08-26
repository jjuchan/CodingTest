package programmers.days.day3;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Long N = sc.nextLong();

        Long result = Solution(N);
        System.out.println(result);
    }

    private static Long Solution(Long n) {
        for (long i = 1; i < n; i++) {
            if (i * i == n) {
                return  (i + 1) * (i + 1);
            }
        }
        return -1L;
    }
}


//n이 어떤 수의 제곱이라면 1을 출력을 하게 된다.