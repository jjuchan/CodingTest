package bj.Bronze.Bronze_1;

import java.util.Scanner;

public class BJ_2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(); //큰 수
        int B = sc.nextInt(); // 작은 수

        int originalA = A; // 최소 공배수 공식을 구할때 초기값이 필요함
        int originalB = B;


        while (B != 0) { //작은 수로 큰 수를 나눌 때 나머지가 0이 되는 값을 찾는다.
            int temp = B; //작은 수는 다음에 나누어지는 값이 되어야하니 담아두기
            B = A % B; // 작은 수에 나머지 값을 넣기
            A = temp; // 작은 수가 큰수
        }
        int gcd = A;
        int lcm = originalA * originalB / gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
}
