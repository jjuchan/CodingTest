package backjon;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class test16922 {
    static int N;
    static int[] values = {1, 5, 10, 50};
    static Set<Integer> result = new HashSet<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        dfs(0, 0, 0);
        System.out.println(result.size());
    }

    private static void dfs(int depth, int sum, int start) {
        if (depth == N) {
            result.add(sum);
            return;
        }
        for (int i = start; i < values.length; i++) {
            dfs(depth + 1, sum + values[i], i);
        }
    }
}
