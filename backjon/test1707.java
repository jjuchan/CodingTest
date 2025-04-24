package backjon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class test1707 {
    static ArrayList<Integer>[] A;
    static int[] check;
    static boolean[] visited;
    static boolean IsEven;

    public static void main(String[] args) throws IOException {
        // 이분 그래프 : 에지로 연결된 노드들끼리 서로 다른 배열에 들어감 ex) 노드가 일자로 연결되어 있거나 사이클로 되어있을 때, 트리는 무조건 이분 그래프
    // 갔던 노드를 다시 방문 한다면 사이클이 발생하면서 이분 그래프가 되지 않는다.
    // 1. 테스트 케이스 갯수
    // 2. 노드 갯수, 에지의 갯수
    // 3. 에지의 방향 정보

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testcase; i++) {
            String[] s = br.readLine().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);

            A = new ArrayList[V + 1];
            visited = new boolean[V + 1];
            check = new int[V + 1];
            IsEven = true;

            for (int j = 1; j <= V; j++) {
                A[j] = new ArrayList<>();
            }

            for (int t = 0; t < E; t++) {
                s = br.readLine().split(" ");
                int start = Integer.parseInt(s[0]);
                int end = Integer.parseInt(s[1]);
                A[start].add(end);
                A[end].add(start);
            }

            for (int a = 1; a <= V; a++) {
                if (!visited[a]) {
                    DFS(a);
                }
            }

            if (IsEven) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static void DFS(int start) {
        visited[start] = true;
        for (int a : A[start]) {
            if (!visited[a]) {
                check[a] = (check[start] + 1) % 2;
                DFS(a);
            } else {
                if (check[a] == check[start]) {
                    IsEven = false;
                }
            }
        }
    }
}



