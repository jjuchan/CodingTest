import java.io.*;
import java.util.*;

public class Main {
    static int n, start, end, m;
    static ArrayList<Integer>[] member;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine()); // 노드 수

        StringTokenizer st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken()); //시작
        end = Integer.parseInt(st.nextToken()); // 끝

        m = Integer.parseInt(br.readLine()); //간선 수
        member = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            member[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            member[a].add(b);
            member[b].add(a);
        }

        int result = bfs(start);

        if (result == -1) {
            System.out.print(-1);
        } else {
            System.out.print(result);
        }
    }

    private static int bfs(int A) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{A, 0}); // 시작 노드와 촌수 0으로 초기화
        visited[A] = true;

        while (!q.isEmpty()) {
            int[] now = q.poll();
            int x = now[0];      // 현재 노드
            int c = now[1];      // 현재까지 계산된 촌수

            if (x == end) return c; // 목적 노드 도착하면 촌수 반환

            for (int a : member[x]) {
                if (!visited[a]) {
                    visited[a] = true;
                    q.add(new int[]{a, c + 1});
                }
            }
        }
        return -1; // 연결 안 된 경우
    }
}