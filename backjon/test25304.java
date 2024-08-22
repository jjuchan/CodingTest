package backjon;


import java.util.Scanner;

public class test25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt(); //입력 한 총 금액
        int N = sc.nextInt(); // 물건 종류 수
        int T = 0; // 계산해서 나온 총 금액


        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            T += a * b; //곱한 금액을 차례대로 더하는 식

        }
        if (X == T) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}

