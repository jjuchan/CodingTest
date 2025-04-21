package backjon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class test25305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

        // "5 2" -> 공백 기준으로 나누기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // N = 5
        int k = Integer.parseInt(st.nextToken()); // k = 2

        int[] A = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);

        // 내림차순으로 뒤집기
        for (int i = 0; i < A.length / 2; i++) {
            int temp = A[i];
            A[i] = A[A.length - 1 - i];
            A[A.length - 1 - i] = temp;
        }

        System.out.println(A[k - 1]); // 커트라인 점수 출력
    }
}