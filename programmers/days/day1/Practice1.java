package programmers.day1;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        StringBuilder stringBuilder = new StringBuilder();

        for (char c : a.toCharArray()) {
            if (Character.isUpperCase(c)) {
                stringBuilder.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                stringBuilder.append(Character.toUpperCase(c));
            }
        }
        sc.close();
        System.out.println(stringBuilder);
    }
}