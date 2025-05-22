package programmers.day4;

import java.util.*;

public class practice5 {
    public static void main(String[] args) {


        System.out.println(solution(3, 20, 4));

    }

    public static long solution(int price, int money, int count) {
        long total = 0;
        for (int i = 1; i <= count; i++) {
            total += (long) price * i;
        }

        if (money >= total) {
            return 0;
        } else {
            return total - money;
        }
    }
}
// N 번째 이용하면 N배 받기