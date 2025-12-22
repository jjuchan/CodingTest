

import java.io.*;
import java.util.*;

public class Main {
    static int M, N, H;
    static int[][][] box;
    static boolean[][][] visited;
    static int[] dx = {1, -1, 0, 0, 0, 0};
    static int[] dy = {0, 0, 1, -1, 0, 0};
    static int[] dz = {0, 0, 0, 0, 1, -1};

    static Queue<int[]> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken()); // 가로
        N = Integer.parseInt(st.nextToken()); // 세로
        H = Integer.parseInt(st.nextToken()); // 높이

        box = new int[H][N][M];
        visited = new boolean[H][N][M];

        // 입력 받기
        for (int h = 0; h < H; h++) {
            for (int n = 0; n < N; n++) {
                st = new StringTokenizer(br.readLine());
                for (int m = 0; m < M; m++) {
                    box[h][n][m] = Integer.parseInt(st.nextToken());
                    if (box[h][n][m] == 1) {
                        q.offer(new int[]{h, n, m});
                        visited[h][n][m] = true;
                    }
                }
            }
        }

        bfs();
        int result = getResult();
        System.out.println(result);
    }

    static void bfs() {
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int z = cur[0];
            int x = cur[1];
            int y = cur[2];

            for (int i = 0; i < 6; i++) {
                int nz = z + dz[i];
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nz >= 0 && nz < H && nx >= 0 && nx < N && ny >= 0 && ny < M) {
                    if (!visited[nz][nx][ny] && box[nz][nx][ny] == 0) {
                        box[nz][nx][ny] = box[z][x][y] + 1;
                        visited[nz][nx][ny] = true;
                        q.offer(new int[]{nz, nx, ny});
                    }
                }
            }
        }
    }

    static int getResult() {
        int max = 0;
        for (int z = 0; z < H; z++) {
            for (int x = 0; x < N; x++) {
                for (int y = 0; y < M; y++) {
                    if (box[z][x][y] == 0) {
                        return -1;
                    }
                    max = Math.max(max, box[z][x][y]);
                }
            }
        }
        return max - 1;
    }
}
