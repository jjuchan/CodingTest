package backjon;

import java.util.Scanner;

public class test1789 {

    public static void main(String[] args) { // 서로 다른 N개의 합 S를 알때 N의 최댓값
        Scanner sc = new Scanner(System.in);

        long S = sc.nextLong(); // 합을 입력 받음

        int sum = 0;

        int i = 0;

        while (sum <= S) {
            i++;
            sum += i;
        }
        System.out.println(i-1); //초과한 값이니까 1빼줘야함

        sc.close();
    }
}
