

import java.io.*;
import java.util.*;

public class Main {
    static int N,M,V;
    static boolean[] visited;
    static ArrayList<Integer>[] number;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); //노드
        M = Integer.parseInt(st.nextToken()); //간선
        V = Integer.parseInt(st.nextToken()); //시작 지점

        number = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            number[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            number[a].add(b);
            number[b].add(a); // 노드를 양뱡항으로도 체크를 해줘야함
        }
        for (int i = 1; i <= N; i++) {
            Collections.sort(number[i]);
        }
        visited = new boolean[N + 1];
        dfs(V);

        System.out.println();
        
        visited = new boolean[N + 1];
        bfs(V);

    }

    private static void dfs(int v) {
        visited[v] = true;
        System.out.print(v + " ");
        for (int i : number[v]) {
            if (!visited[i]) {
                dfs(i);
            }
        }
    }

    private static void bfs(int v) {
        Queue<Integer> q = new LinkedList<>();
        visited[v] = true;
        q.add(v);

        while (!q.isEmpty()) {
            int start = q.poll();
            System.out.print(start + " ");
            for (int i : number[start]) {
                if (!visited[i]) {
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
    }
}
// dfs bfs 구현 결과