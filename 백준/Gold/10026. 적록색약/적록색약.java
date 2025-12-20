

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static int[] dx = {1, -1, 0, 0};  
    static int[] dy = {0, 0, 1, -1};
    static int N;
    static char[][] map;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bufferedReader.readLine());
        map = new char[N][N];

        for (int i = 0; i < N; i++) {
            char[] line = bufferedReader.readLine().toCharArray();
            for (int j = 0; j < N; j++) {
                map[i][j] = line[j];
            }
        }

        // 정상 시각
        visited = new boolean[N][N];
        int normal = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    bfs(i, j, map[i][j]);
                    normal++;
                }
            }
        }

        // 적록색약 시각
        visited = new boolean[N][N];
        int blind = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    bfsColorBlind(i, j, map[i][j]);
                    blind++;
                }
            }
        }

        System.out.println(normal + " " + blind);
    }

    private static void bfs(int x, int y, char color) {
        Queue<int[]> queue = new LinkedList<>();
        visited[x][y] = true;
        queue.add(new int[]{x, y});

        while (!queue.isEmpty()) {
            int[] pos = queue.poll();
            int cx = pos[0];
            int cy = pos[1];

            for (int d = 0; d < 4; d++) {
                int nx = cx + dx[d];
                int ny = cy + dy[d];

                if (nx >= 0 && nx < N && ny >= 0 && ny < N) {
                    if (!visited[nx][ny] && map[nx][ny] == color) {
                        visited[nx][ny] = true;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }
    }

    private static void bfsColorBlind(int x, int y, char color) {
        Queue<int[]> queue = new LinkedList<>();
        visited[x][y] = true;
        queue.add(new int[]{x, y});

        while (!queue.isEmpty()) {
            int[] pos = queue.poll();
            int cx = pos[0];
            int cy = pos[1];

            for (int d = 0; d < 4; d++) {
                int nx = cx + dx[d];
                int ny = cy + dy[d];

                if (nx >= 0 && nx < N && ny >= 0 && ny < N) {
                    if (!visited[nx][ny] && isSameColor(color, map[nx][ny])) {
                        visited[nx][ny] = true;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }
    }

    private static boolean isSameColor(char a, char b) {
        if (a == b) return true;
        return (a == 'R' && b == 'G') || (a == 'G' && b == 'R');
    }
}
