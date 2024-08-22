package backjon;

import java.util.Scanner;

public class test2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 0; i < N; i++){ //i는 열의 수,j는 행
            for(int j = 0; j <= i; j++){ //i가 1이면 별도 1개 2면 두개 즉 i 랑 j랑 같아야 한다
                System.out.printf("*");
            }System.out.println();
        }
    }
}
