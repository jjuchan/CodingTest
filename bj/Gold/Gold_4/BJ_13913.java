package bj.Gold.Gold_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ_13913 {
    static final int MAX = 100000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] time = new int[MAX + 1];
        int[] prev = new int[MAX + 1];
        boolean[] visited = new boolean[MAX + 1];

        Arrays.fill(prev, -1);

        Queue<Integer> q = new LinkedList<>();
        q.add(N);
        visited[N] = true;

        while (!q.isEmpty()) {
            int cur = q.poll();

            if (cur == K) break;  // 동생 찾으면 종료

            int[] nexts = {cur - 1, cur + 1, cur * 2};
            for (int next : nexts) {
                if (next >= 0 && next <= MAX && !visited[next]) {
                    visited[next] = true;
                    time[next] = time[cur] + 1;
                    prev[next] = cur;
                    q.add(next);
                }
            }
        }

        System.out.println(time[K]);

        List<Integer> path = new ArrayList<>();
        for (int i = K; i != -1; i = prev[i]) {
            path.add(i);
        }
        Collections.reverse(path);

        for (int pos : path) {
            System.out.print(pos + " ");
        }
    }
}
