package bj.Gold.Gold_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BJ_13549 {
    static final int MAX = 100000;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int time = bfs(N, K);
        System.out.println(time);
    }

    private static int bfs(int n, int k) {
        int[] time = new int[MAX + 1];
        for (int i = 0; i <= MAX; i++) time[i] = -1;

        Deque<Integer> dq = new ArrayDeque<>();
        time[n] = 0;
        dq.add(n);

        while (!dq.isEmpty()) {
            int cur = dq.poll();

            if (cur == k) return time[cur];

            // 순간이동 (0초)
            if (cur * 2 <= MAX && time[cur * 2] == -1) {
                time[cur * 2] = time[cur];
                dq.addFirst(cur * 2);
            }

            // X - 1
            if (cur - 1 >= 0 && time[cur - 1] == -1) {
                time[cur - 1] = time[cur] + 1;
                dq.addLast(cur - 1);
            }

            // X + 1
            if (cur + 1 <= MAX && time[cur + 1] == -1) {
                time[cur + 1] = time[cur] + 1;
                dq.addLast(cur + 1);
            }
        }

        return -1;
    }
}
