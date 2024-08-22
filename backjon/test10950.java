package backjon;

import java.util.ArrayList;
import java.util.Scanner;

public class test10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        ArrayList<Integer> sums = new ArrayList<>(); // 리스트 생성
        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            sums.add(A + B); // 더한 값을 리스트에 저장
        }
        sc.close();

        for (int sum : sums) { // 한번에 sums 출력
            System.out.println(sum);
        }
    }
}


