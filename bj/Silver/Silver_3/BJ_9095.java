package bj.Silver.Silver_3;

import java.util.Scanner;

public class BJ_9095 {
    static int T;
    static int count;
    static int[] arr = {1, 2, 3};
    static int[] arr2 ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        arr2= new int[T];
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            count = 0;
            dfs(0, N);
            arr2[i] = count;
        }
        for (int i : arr2) {
            System.out.println(i);
        }
    }

    private static void dfs(int sum, int N) {
        if (sum == N) {
            count++;
            return;
        }
        if (sum > N) {
            return;
        }

        for (int j : arr) {
            dfs(sum + j, N); // sum 값을 업데이트하며 재귀 호출
        }
    }
}
