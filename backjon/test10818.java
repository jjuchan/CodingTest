package backjon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class test10818 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();


        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }
        int Max = Collections.max(list); // 최댓값을 구하는 클래스
        int Min = Collections.min(list); // 최솟값을 구하는 클래스

        System.out.println(Min+" "+Max);

    }
}
