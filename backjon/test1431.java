package backjon;

import java.io.*;
import java.util.*;

public class test1431 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] number = new String[N];
        for (int i = 0; i < N; i++) {
            number[i] = br.readLine();
        }

        Arrays.sort(number, new Comparator<String>() {
            public int compare(String s, String s1) {
                if (s.length() != s1.length()) {
                    return Integer.compare(s.length(), s1.length());
                }
                int sum = 0;
                int sum2 = 0;
                for (char c : s.toCharArray()) {
                    if (Character.isDigit(c)) {
                        sum += c - '0';
                    }
                }
                for (char c1 : s1.toCharArray()) {
                    if (Character.isDigit(c1)) {
                        sum2 += c1 - '0';
                    }
                }
                if (sum != sum2) {
                    return Integer.compare(sum, sum2);
                }
                return s.compareTo(s1);
            }
        });

        StringBuilder sb = new StringBuilder();

        for (String line : number) {
            sb.append(line).append('\n');
        }
        System.out.print(sb);
    }
}


// A B 중 짧은게 먼저 오고 길이가 같으면 자리수의 합을 통해 작은게 먼저 온다. 아무것도 안되면 그냥  사전 수능로 정렬