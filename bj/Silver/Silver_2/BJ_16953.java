package bj.Silver.Silver_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_16953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        long A = Long.parseLong(input[0]);
        long B = Long.parseLong(input[1]);

        int count = 1;
        while (B > A) {
            if (B % 10 == 1) {
                B /= 10;
            } else if (B % 2 == 0) {
                B /= 2;
            } else {
                break;
            }
            count++;
        }

        if (A == B) {
            System.out.println(count);
        } else {
            System.out.println(-1);
        }
    }
}
