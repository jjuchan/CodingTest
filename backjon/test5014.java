package backjon;


import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class test5014 {
    static int F, S, G, U, D;
    static boolean[] visited;

    public static void main(String[] agrs) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        F = Integer.parseInt(st.nextToken()); // 건물의 꼭대기
        S = Integer.parseInt(st.nextToken()); // 시작 지점
        G = Integer.parseInt(st.nextToken()); // 목표 지점
        U = Integer.parseInt(st.nextToken()); // 위로 올라 갈 수 있는 크기
        D = Integer.parseInt(st.nextToken()); // 아래도 내려갈 수 있는 크기

        visited = new boolean[F + 1];

        int result = bfs(S);
        if (result == -1) {
            System.out.println("use the stairs");
        } else {
            System.out.println(result);
        }
    }

    public static int bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        visited[start] = true;
        q.add(start);
        int button = 0;

        while (!q.isEmpty()) {
            int size = q.size();  // 현재 레벨의 층 수 (큐의 크기)

            // 현재 레벨의 모든 층을 처리한 후에 버튼을 증가시킴
            for (int i = 0; i < size; i++) {
                int now = q.poll();  // 현재 층을 큐에서 꺼냄

                if (now == G) {  // 목표 층에 도달하면 버튼을 반환
                    return button;
                }

                // 위로 올라가거나 아래로 내려갈 수 있는 층
                int[] next = {(now + U), (now - D)};
                for (int go : next) {
                    if (go >= 1 && go <= F && !visited[go]) {
                        visited[go] = true;
                        q.add(go);  // 큐에 추가
                    }
                }
            }

            button++;  // 한 레벨을 모두 탐색한 후 버튼을 한 번 눌렀다고 계산
        }

        return -1;  // 목표 층에 도달할 수 없으면 -1 반환
    }
}
// 건물은 총 F층 , 가야할 곳은 G층, 현재 위치는 S층, U위 ,D 아래 버튼을 최소 몇 번 눌러야지 G층에 갈 수 있는지 출력
// 입력 1. F S G U D 가 공백을 기준으로 주어진다.