package backjon;

import java.util.ArrayList;

import java.util.Scanner;

public class test10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }
        int a = sc.nextInt();
        int b = 0;
        for (int lists : list) {
            if (lists == a) {
                b++;
            }

        }
        System.out.println(b);
    }
}



