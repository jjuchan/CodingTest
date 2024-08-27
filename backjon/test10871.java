package backjon;

import java.util.ArrayList;
import java.util.Scanner;

public class test10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            A.add(sc.nextInt());
        }
        for (int a : A) {
            if (a < X) {
                System.out.println(a);
            }
        }
    }
}
