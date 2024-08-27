package backjon;

import java.util.HashSet;
import java.util.Scanner;

public class test3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> remainders = new HashSet<>();  // 서로 다른 나머지를 저장할 HashSet

        // 10개의 수 입력 받기
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            int remainder = num % 42;  // 42로 나눈 나머지 계산
            remainders.add(remainder);  // HashSet에 추가 (중복은 자동으로 제거됨)
        }

        // 서로 다른 나머지의 개수 출력
        System.out.println(remainders.size());

        sc.close();
    }
}
