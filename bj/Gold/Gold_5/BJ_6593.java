package bj.Gold.Gold_5;

import java.io.*;
import java.util.*;

public class BJ_6593 {
    static int[] dx = {-1, 1, 0, 0, 0, 0};
    static int[] dy = {0, 0, -1, 1, 0, 0};
    static int[] dz = {0, 0, 0, 0, -1, 1};
    static char[][][] building;
    static boolean[][][] visited;
    static int L, R, C;
    static Queue<int[]> q;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            L = Integer.parseInt(st.nextToken());
            R = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());

            if (L == 0 && R == 0 && C == 0) break;

            building = new char[L][R][C];
            visited = new boolean[L][R][C];
            q = new LinkedList<>();

            int startZ = 0, startX = 0, startY = 0;

            for (int l = 0; l < L; l++) {
                for (int r = 0; r < R; r++) {
                    String line = br.readLine();
                    for (int c = 0; c < C; c++) {
                        building[l][r][c] = line.charAt(c);
                        if (building[l][r][c] == 'S') {
                            startZ = l;
                            startX = r;
                            startY = c;
                        }
                    }
                }
                br.readLine(); // 층 사이 빈 줄 처리
            }

            int result = bfs(startZ, startX, startY);
            if (result == -1) {
                System.out.println("Trapped!");
            } else {
                System.out.println("Escaped in " + result + " minute(s).");
            }
        }
    }

    private static int bfs(int z, int x, int y) {
        q.add(new int[]{z, x, y, 0});
        visited[z][x][y] = true;

        while (!q.isEmpty()) {
            int[] now = q.poll();
            int nowZ = now[0], nowX = now[1], nowY = now[2], time = now[3];

            if (building[nowZ][nowX][nowY] == 'E') {
                return time;
            }

            for (int i = 0; i < 6; i++) {
                int nz = nowZ + dz[i];
                int nx = nowX + dx[i];
                int ny = nowY + dy[i];

                if (nz >= 0 && nz < L && nx >= 0 && nx < R && ny >= 0 && ny < C) {
                    if (!visited[nz][nx][ny] && (building[nz][nx][ny] == '.' || building[nz][nx][ny] == 'E')) {
                        visited[nz][nx][ny] = true;
                        q.add(new int[]{nz, nx, ny, time + 1});
                    }
                }
            }
        }

        return -1; // 탈출 못 함
    }
}
