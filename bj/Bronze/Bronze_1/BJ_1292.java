package bj.Bronze.Bronze_1;

import java.util.ArrayList;
import java.util.Scanner;

public class BJ_1292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 구간의 시작 A와 끝 B
        int A = sc.nextInt();  // 구간의 시작 A
        int B = sc.nextInt();  // 구간의 끝 B

        ArrayList<Integer> list = new ArrayList<>();  // 수열을 저장할 리스트

        // 수열 만들기 (1부터 1000번째까지의 수열을 만들기)
        for (int i = 1; i <= 1000; i++) {
            for (int j = 0; j < i; j++) {
                list.add(i);  // i를 i번 반복해서 추가
            }
        }

        // 구간 A부터 B까지 합 구하기
        int sum = 0;
        for (int i = A - 1; i < B; i++) {
            sum += list.get(i);  // 리스트에서 인덱스 A-1 부터 B까지의 값 더하기
        }

        System.out.println(sum);  // 결과 출력
    }
}
