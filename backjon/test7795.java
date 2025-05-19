package backjon;

import java.util.*;
import java.io.*;

public class test7795 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int[] arr1 = new int[A];
            int[] arr2 = new int[B];

            st = new StringTokenizer(br.readLine());
            for (int a = 0; a < A; a++) {
                arr1[a] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for (int b = 0; b < B; b++) {
                arr2[b] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr2);  // arr2 정렬

            int count = 0;
            for (int j = 0; j < arr1.length; j++) {
                count += find(arr1[j], arr2);
            }
            System.out.println(count);

        }
    }

    // arr 배열에서 target보다 작은 값의 개수 리턴 (이분탐색)
    public static int find(int target, int[] arr) {
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
