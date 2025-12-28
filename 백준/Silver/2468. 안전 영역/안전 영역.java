

import java.util.*;

public class Main {
    static int[] dx = {-1, 1, 0, 0}; // 상하좌우
    static int[] dy = {0, 0, -1, 1};
    static int[][] floor;
    static boolean[][] visited;
    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        floor = new int[N][N];

        int maxHeight = 0;

        // 높이 입력 및 최대 높이 찾기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                floor[i][j] = sc.nextInt();
                maxHeight = Math.max(maxHeight, floor[i][j]);
            }
        }

        int maxSafe = 0;

        // 강우 높이 h를 0부터 maxHeight까지 탐색
        for (int h = 0; h <= maxHeight; h++) {
            visited = new boolean[N][N];
            int safeCount = 0;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (!visited[i][j] && floor[i][j] > h) {
                        bfs(i, j, h);
                        safeCount++;
                    }
                }
            }

            maxSafe = Math.max(maxSafe, safeCount);
        }

        System.out.println(maxSafe);
    }

    // BFS로 인접한 안전 지역 탐색
    public static void bfs(int x, int y, int h) {
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

                if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
                    if (!visited[nx][ny] && floor[nx][ny] > h) {
                        visited[nx][ny] = true;
                        q.add(new int[]{nx, ny});
                    }
                }
            }
        }
    }
}
