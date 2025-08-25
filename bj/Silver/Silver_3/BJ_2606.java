package bj.Silver.Silver_3;

import java.io.*;
import java.util.*;


public class BJ_2606 {
    static int N,M,count;
    static ArrayList<Integer>[] list;
    static boolean[] visited;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine()); //컴퓨터
        M = Integer.parseInt(br.readLine()); // 연결 선

        list = new ArrayList[N + 1];
        visited = new boolean[N + 1];

        for (int i = 1; i <= N; i++) { //컴퓨터를 인접리스트에 넣어준다.
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()); //시작 노드
            int b = Integer.parseInt(st.nextToken()); //끝나는 노드
            list[a].add(b);
            list[b].add(a); //양방향으로 연결
        }
        count = 0;
        System.out.print(dfs(1));


    }

    private static int dfs(int i) {
        visited[i] = true;
        for (int x : list[i]) {
            if (!visited[x]) {
                count ++;
                dfs(x);
            }
        }
        return count;
    }
}
