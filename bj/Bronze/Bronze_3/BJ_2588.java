package bj.Bronze.Bronze_3;

import java.util.Scanner;

public class BJ_2588 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(A*((B%100)%10)); // 두번째 수를 100으로 나눈 나머지를 구한 후, 10으로 나눈 나머지와 곱해준다. 즉 첫번째 수 x 두번째 수의 일의 자릿수
        System.out.println(A*((B%100)/10)); // 100으로 나머지를 구한 뒤 10으로 나눈 몫을 A랑 곱해준다. 즉 첫번째 수 x 두번째 수의 십의 자릿수
        System.out.println(A*(B/100)); // 100으로 나눈 몫이랑 A랑 곱해준다. 즉 첫번재 수 x 두번째 수의 백의 자릿수
        System.out.println(A*B);


        sc.close();
    }
}
