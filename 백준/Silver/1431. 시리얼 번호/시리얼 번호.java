import java.io.*;
import java.util.*;

public class Main {
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