package backjon;

import java.util.Scanner;

public class test11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String M = sc.next();
        sc.close();

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += M.charAt(i) - 48; //charAt는 문자열을 돌면서 문자를 각각 하나씩 뽑는 함수 이고 문자형에서 정수형으로 변환시에는 -48이나 -'0'을 해야 정수형으로 됨
        }
        System.out.println(sum);
    }
}

