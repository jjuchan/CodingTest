package backjon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test5622 {
    public static void main(String[] args) throws IOException {
        // 다이얼이 1부터 0까지 들어가 있음, 시간초는 0~11까지

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0; // 숫자 합

        char[] chars = br.readLine().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'A' || chars[i] == 'B' || chars[i] == 'C') {
                sum += 3;
            }
            if (chars[i] == 'F' || chars[i] == 'D' || chars[i] == 'E') {
                sum += 4;
            }
            if (chars[i] == 'G' || chars[i] == 'H' || chars[i] == 'I') {
                sum += 5;
            }
            if (chars[i] == 'J' || chars[i] == 'K' || chars[i] == 'L') {
                sum += 6;
            }
            if (chars[i] == 'M' || chars[i] == 'N' || chars[i] == 'O') {
                sum += 7;
            }
            if (chars[i] == 'P' || chars[i] == 'Q' || chars[i] == 'R' || chars[i] == 'S') {
                sum += 8;
            }
            if (chars[i] == 'T' || chars[i] == 'U' || chars[i] == 'V') {
                sum += 9;
            }
            if (chars[i] == 'W' || chars[i] == 'X' || chars[i] == 'Y' || chars[i] == 'Z') {
                sum += 10;
            }

        }
        System.out.println(sum);
    }
}
