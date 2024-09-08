package backjon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class test2562 {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 9; i++) {
            A.add(sc.nextInt());
        }
        int Max = Collections.max(A);
        int index = A.indexOf(Max)+1; // indexOf 몇번째 인덱스인지 나타내주는 클래스
        System.out.println(Max + " " + index);

    }

}