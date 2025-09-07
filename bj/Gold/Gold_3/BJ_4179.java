package bj.Gold.Gold_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ_4179 {
    static int dx[] = {1, -1, 0, 0};
    static int dy[] = {0, 0, 1, -1};
    static int R, C;
    static int[][] fireTime;
    static int[][] map;
    static boolean[][] visited;
    static Queue<int[]> fireQ = new LinkedList<>();
    static Queue<int[]> jihunQ = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        R = Integer.parseInt(stringTokenizer.nextToken());
        C = Integer.parseInt(stringTokenizer.nextToken());

        fireTime = new int[R][C];
        map = new int[R][C];
        visited = new boolean[R][C];

        for (int i = 0; i < R; i++) {
            Arrays.fill(fireTime[i], -1); // 불 도달 시간 초기화
        }

        for (int i = 0; i < R; i++) {
            String string = br.readLine();
            for (int j = 0; j < C; j++) {
                char c = string.charAt(j);
                if (c == '#') {
                    map[i][j] = -1; // 벽
                } else if (c == '.') {
                    map[i][j] = 0; // 빈 공간
                } else if (c == 'J') {
                    map[i][j] = 1; // 지훈 시작 위치
                    jihunQ.add(new int[]{i, j, 0}); // (x, y, 시간)
                    visited[i][j] = true;
                } else if (c == 'F') {
                    map[i][j] = -2; // 불
                    fireQ.add(new int[]{i, j});
                    fireTime[i][j] = 0;
                }
            }
        }

        spreadFire(); // 불 확산 시뮬레이션
        int result = Jihun(); // 지훈이 탈출 시도
        System.out.println(result == -1 ? "IMPOSSIBLE" : result);
    }

    static void spreadFire() {
        while (!fireQ.isEmpty()) {
            int[] fire = fireQ.poll();
            int x = fire[0];
            int y = fire[1];
            int time = fireTime[x][y];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < R && ny >= 0 && ny < C) {
                    if (map[nx][ny] != -1 && map[nx][ny] != -2 && fireTime[nx][ny] == -1) {
                        fireTime[nx][ny] = time + 1;
                        fireQ.add(new int[]{nx, ny});
                    }
                }
            }
        }
    }

    static int Jihun() {
        while (!jihunQ.isEmpty()) {
            int[] jihun = jihunQ.poll();
            int x = jihun[0];
            int y = jihun[1];
            int time = jihun[2];

            // 지훈이가 탈출한 경우(가장자리 도착)
            if (x == 0 || x == R - 1 || y == 0 || y == C - 1) {
                return time + 1;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < R && ny >= 0 && ny < C) {
                    // 빈칸 또는 불 안 번진 곳이고, 불보다 먼저 도착 가능할 때만 이동
                    if (!visited[nx][ny] && map[nx][ny] != -1) {
                        if (fireTime[nx][ny] == -1 || fireTime[nx][ny] > time + 1) {
                            visited[nx][ny] = true;
                            jihunQ.add(new int[]{nx, ny, time + 1});
                        }
                    }
                }
            }
        }
        return -1; // 탈출 불가
    }
}
