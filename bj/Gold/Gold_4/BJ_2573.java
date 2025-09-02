package bj.Gold.Gold_4;

import java.io.*;
import java.util.*;

public class BJ_2573 {
    static int[][] map;
    static int[][] temp;
    static boolean[][] visited;
    static int N, M;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int year = 0;

        while (true) {
            visited = new boolean[N][M];
            int bfscount = 0;

            // 덩어리 개수 세기
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (map[i][j] > 0 && !visited[i][j]) {
                        bfs(i, j);
                        bfscount++;
                    }
                }
            }

            if (bfscount == 0) {
                System.out.println(0); // 모두 녹음
                break;
            } else if (bfscount >= 2) {
                System.out.println(year); // 두 덩어리 이상
                break;
            }

            // 빙하 녹이기
            melt();

            year++;
        }
    }

    // BFS: 덩어리 탐색용
    private static void bfs(int startX, int startY) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startX, startY});
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= N || ny < 0 || ny >= M) continue;
                if (map[nx][ny] > 0 && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx, ny});
                }
            }
        }
    }

    // melt: 이번 년도에 녹을 양 계산 후 map 갱신
    private static void melt() {
        temp = new int[N][M];

        for (int i = 0; i < N; i++) {
            System.arraycopy(map[i], 0, temp[i], 0, M);
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] > 0) {
                    int sea = 0;
                    for (int k = 0; k < 4; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];
                        if (nx < 0 || nx >= N || ny < 0 || ny >= M) continue;
                        if (map[nx][ny] == 0) sea++;
                    }
                    temp[i][j] -= sea;
                    if (temp[i][j] < 0) temp[i][j] = 0;
                }
            }
        }

        // temp → map 갱신
        for (int i = 0; i < N; i++) {
            System.arraycopy(temp[i], 0, map[i], 0, M);
        }
    }
}
