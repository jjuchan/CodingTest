package bj.Silver.Silver_2;

import java.util.*;

public class BJ_1012 {

    // 방향 벡터: 상, 우, 하, 좌 (시계 방향)
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static boolean[][] visited; // 방문 여부
    static int[][] ground;      // 밭 상태 (배추가 있는지 여부)
    static int M, N, K;         // 가로, 세로, 배추 개수

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 수

        for (int t = 0; t < T; t++) {
            M = sc.nextInt(); // 밭의 가로 길이
            N = sc.nextInt(); // 밭의 세로 길이
            K = sc.nextInt(); // 배추가 심어진 위치 개수

            ground = new int[M][N];     // 밭 정보 초기화
            visited = new boolean[M][N]; // 방문 배열 초기화

            // 배추 위치 입력 받아 밭에 표시 (1: 배추 존재)
            for (int i = 0; i < K; i++) {
                int x = sc.nextInt(); // 배추의 x좌표 (가로)
                int y = sc.nextInt(); // 배추의 y좌표 (세로)
                ground[x][y] = 1;
            }

            int wormCount = 0; // 필요한 지렁이 수

            // 밭 전체 탐색
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    // 배추가 있고 아직 방문하지 않은 경우 -> BFS 탐색 시작
                    if (ground[i][j] == 1 && !visited[i][j]) {
                        bfs(i, j);     // 연결된 배추 묶음을 전부 탐색
                        wormCount++;   // 새로운 묶음마다 지렁이 1마리 필요
                    }
                }
            }

            // 결과 출력
            System.out.println(wormCount);
        }
    }

    /**
     * BFS로 연결된 배추 묶음을 모두 방문 처리
     * @param x 시작 x좌표
     * @param y 시작 y좌표
     */
    private static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});
        visited[x][y] = true;

        while (!q.isEmpty()) {
            int[] now = q.poll(); // 현재 위치
            int curX = now[0];
            int curY = now[1];

            // 현재 위치에서 4방향 탐색
            for (int i = 0; i < 4; i++) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                // 범위 안에 있고, 배추가 있으며, 아직 방문하지 않았다면
                if (nx >= 0 && ny >= 0 && nx < M && ny < N) {
                    if (ground[nx][ny] == 1 && !visited[nx][ny]) {
                        visited[nx][ny] = true;       // 방문 처리
                        q.add(new int[]{nx, ny});     // 큐에 추가해 탐색 계속
                    }
                }
            }
        }
    }
}
