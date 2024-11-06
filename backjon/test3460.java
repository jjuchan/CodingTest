package backjon;

import java.util.Scanner;

public class test3460 {
    public static void main(String[] args) {
        // n이 주어 졌음, 이를 이진수로 나타내야함, 그때 1의 위치 찾기 13 1 0 1 1
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int index = 0; //1의 위치를 나타낸다

            while (n > 0) {
                if (n % 2 == 1) { // 홀수일 경우 처음에 0을 출력
                    System.out.print(index + " ");
                }
                n /= 2;
                index++;
            }
            System.out.println();
        }
        sc.close();
    }
}

