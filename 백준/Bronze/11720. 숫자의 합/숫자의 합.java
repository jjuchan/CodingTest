
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String M = sc.next();
        sc.close();

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += M.charAt(i) - 48;
        }
        System.out.println(sum);
    }
}

