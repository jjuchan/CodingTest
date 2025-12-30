

import java.util.*;

public class Main {
    static int[] visited = new int[100001]; // 최대 범위: 0 ~ 100000
    static int N, K;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); // 수빈 위치
        K = sc.nextInt(); // 동생 위치
        bfs(N);
    }

    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = 1; // 시작점은 1로 표시 (0이면 미방문 구분이 안 되므로)

        while (!q.isEmpty()) {
            int now = q.poll();

            // 목표 위치에 도달했다면 종료
            if (now == K) {
                System.out.println(visited[now] - 1); // 처음을 1로 시작했으므로 출력은 -1
                return;
            }

            // 다음 이동할 수 있는 위치들
            int[] nexts = {now - 1, now + 1, now * 2};

            for (int next : nexts) {
                // 범위 체크 + 미방문한 경우만 큐에 넣기
                if (next >= 0 && next < visited.length && visited[next] == 0) {
                    visited[next] = visited[now] + 1; // 현재까지 걸린 시간 +1
                    q.add(next);
                }
            }
        }
    }
}
