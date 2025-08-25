package bj.Silver.Silver_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_11047 {
    public static void main(String[] args) throws IOException {
        // N = 동전의 총 종류
        // K = 돈의 합

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int sum = 0;

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());
            arr[i] = x;
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (K >= arr[i]) {
                sum += (K / arr[i]);
                K = K % arr[i];
            }
        }
        System.out.println(sum);

    }
}
