package bj.Silver.Silver_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BJ_11724 {
    static boolean visited[];
    static ArrayList<Integer>[] A;
    public static void main(String[] args) throws IOException {
        // 연결 요소는 몇개의 그래프가 연결 되어 있는지 찾는 것 == dfs 횟수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); //노드 갯수,숫자의 갯수
        int m = Integer.parseInt(st.nextToken()); //에지 갯수, 선의 갯수
        visited = new boolean[n+1];
        A = new ArrayList[n+1];
        for(int i = 1; i<n+1; i++){
            A[i] = new ArrayList<Integer>();
        }
        for(int i = 0; i<m; i++){
           st = new StringTokenizer(br.readLine());
           int s = Integer.parseInt(st.nextToken()); //시작점
            int e = Integer.parseInt(st.nextToken()); //종료점
            A[s].add(e); // 방향성이 양쪽으로도 갈 수 있기 때문에
            A[e].add(s);
        }
        int count = 0; // dfs 횟수
        for(int i = 1; i<n+1; i++){
            if(!visited[i]){
                count++;
                DFS(i);
            }
        }
        System.out.println(count);
    }

    private static void DFS(int v) {
        if (visited[v]) {
            return;
        }
        visited[v] = true;
        for (int i : A[v]) {
            if (!visited[i]) {
                DFS(i); //재귀함수
            }
        }

    }
}
