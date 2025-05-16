package backjon;

import java.io.*;
import java.util.*;

public class test11652 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long[] arr = new long[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(br.readLine());
        }

        Arrays.sort(arr);

        long answer = arr[0];
        int maxCount = 1;
        int count = 1;

        for (int i = 1; i < N; i++) {
            if (arr[i] == arr[i-1]) {
                count++;
            } else {
                count = 1;
            }

            if (count > maxCount) {
                maxCount = count;
                answer = arr[i];
            }
        }

        System.out.println(answer);
    }
}
