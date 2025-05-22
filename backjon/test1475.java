package backjon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1475 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] count = new int[10];

        String N = br.readLine();

        for (int i = 0; i < N.length(); i++) {
            int num = N.charAt(i) - '0'; // 문자 → 숫자 변환
            if (num == 6 || num == 9) {
                count[6]++; // 6과 9는 같은 그룹으로 취급
            } else {
                count[num]++;
            }
        }
        count[6] = (count[6] + 1) / 2;
        int max = 0;
        for (int i = 0; i < 9; i++) {
            max = Math.max(max, count[i]);
        }

        System.out.println(max);
    }
}
