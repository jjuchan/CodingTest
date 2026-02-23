import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String t = br.readLine();

        int lcm = lcm(s.length(), t.length());

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < lcm / s.length(); i++) {
            sb1.append(s);
        }

        for (int i = 0; i < lcm / t.length(); i++) {
            sb2.append(t);
        }

        if (sb1.toString().equals(sb2.toString())) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    private static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
