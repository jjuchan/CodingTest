package bj.Silver.Silver_5;

import java.util.Scanner;

public class BJ_2018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 1; //숫자의 시작이 1부터 시작학기 때문
        int count = 1; // N이 하나만 나왔을때도 포함이라 1로 시작 ex) N이 10이면 10이 나오는것도 하나의 경우의 수이기 때문
        int start = 1;
        int end = 1;

        while(end != N ){
            if (sum == N) {
                count++;
                end++;
                sum += end;
            } else if (sum > N) {
                sum -= start;
                start++;
            } else {
                end++;
                sum += end;
            }
        }
        System.out.println(count);
    }
}
