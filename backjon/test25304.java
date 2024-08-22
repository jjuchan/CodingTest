package backjon;


import java.util.Scanner;

public class test25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        int T = 0;


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

