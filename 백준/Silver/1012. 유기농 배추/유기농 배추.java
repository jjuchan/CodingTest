

import java.util.*;

public class Main {
    static int[] dx = {-1, 0, 1, 0}; // 상우하좌
    static int[] dy = {0, 1, 0, -1};
    static boolean[][] visited;
    static int[][] ground;
    static int M, N, K;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 수

        for (int t = 0; t < T; t++) {
            M = sc.nextInt(); // 가로
            N = sc.nextInt(); // 세로
            K = sc.nextInt(); // 배추 개수

            ground = new int[M][N];
            visited = new boolean[M][N];

            // 배추 심기
            for (int i = 0; i < K; i++) {
                int x = sc.nextInt(); // 가로
                int y = sc.nextInt(); // 세로
                ground[x][y] = 1;
            }

            int wormCount = 0;

            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if (ground[i][j] == 1 && !visited[i][j]) {
                        bfs(i, j);
                        wormCount++; // 새로운 배추 덩어리 발견
                    }
                }
            }

            System.out.println(wormCount);
        }
    }

    // BFS 함수
    private static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});
        visited[x][y] = true;

        while (!q.isEmpty()) {
            int[] now = q.poll();
            int curX = now[0];
            int curY = now[1];

            for (int i = 0; i < 4; i++) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if (nx >= 0 && ny >= 0 && nx < M && ny < N) {
                    if (ground[nx][ny] == 1 && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        q.add(new int[]{nx, ny});
                    }
                }
            }
        }
    }
}
