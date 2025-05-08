package backjon;

import java.math.BigInteger;
import java.util.Scanner;

public class test13706 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger N = sc.nextBigInteger();

        BigInteger start = BigInteger.ONE;
        BigInteger end = N;

        while (start.compareTo(end) <= 0) {
            BigInteger mid = (start.add(end)).divide(BigInteger.TWO);
            BigInteger answer = mid.pow(2);
            int result = answer.compareTo(N);

            if (result == 0) {
                System.out.println(mid);
                return;
            } else if (result < 0) {
                start = mid.add(BigInteger.ONE);
            } else {
                end = mid.subtract(BigInteger.ONE); //수가 너무 크면 작아져야 하니까 마지막 값을 줄여줌
            }
        }

    }
}
