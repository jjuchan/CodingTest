package backjon;

<<<<<<< HEAD
=======
import java.util.ArrayList;

>>>>>>> e0bba7ae510b243e1652944b0a9d198631248f30
import java.util.Scanner;

public class test10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
<<<<<<< HEAD

        // 정수 N 입력
        int N = sc.nextInt();
        int[] numbers = new int[N];

        // N개의 정수 입력
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }

        // 찾고자 하는 정수 v 입력
        int v = sc.nextInt();
        int count = 0;

        // 배열에서 v의 개수를 센다.
        for (int i = 0; i < N; i++) {
            if (numbers[i] == v) {
                count++;
            }
        }

        // 결과 출력
        System.out.println(count);

        sc.close();
    }
}
=======
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



>>>>>>> e0bba7ae510b243e1652944b0a9d198631248f30
