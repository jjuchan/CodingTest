package bj.Bronze.Bronze_5;

import java.util.Scanner;

public class BJ_27866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int i = sc.nextInt();
        String[] arr = S.split("");
        System.out.println(arr[i-1]);

    }
}
