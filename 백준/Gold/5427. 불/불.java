

import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static char[][] map;
    static boolean[][] visited;
    static int T, w, h;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken()); // 열
            h = Integer.parseInt(st.nextToken()); // 행
            map = new char[h][w];
            visited = new boolean[h][w];

            Queue<int[]> fire = new LinkedList<>();
            Queue<int[]> person = new LinkedList<>();

            for (int a = 0; a < h; a++) {
                String line = br.readLine();
                for (int b = 0; b < w; b++) {
                    map[a][b] = line.charAt(b);
                    if (map[a][b] == '*') {
                        fire.add(new int[]{a, b});
                    } else if (map[a][b] == '@') {
                        person.add(new int[]{a, b, 0});
                        visited[a][b] = true;
                    }
                }
            }

            boolean escaped = false;

            while (!person.isEmpty()) {
                // 1. 불 먼저 확산
                int fireSize = fire.size();
                for (int f = 0; f < fireSize; f++) {
                    int[] fnow = fire.poll();
                    int fx = fnow[0];
                    int fy = fnow[1];

                    for (int d = 0; d < 4; d++) {
                        int nx = fx + dx[d];
                        int ny = fy + dy[d];

                        if (nx >= 0 && ny >= 0 && nx < h && ny < w) {
                            if (map[nx][ny] == '.' || map[nx][ny] == '@') {
                                map[nx][ny] = '*';
                                fire.add(new int[]{nx, ny});
                            }
                        }
                    }
                }

                // 2. 상근이 이동
                int pSize = person.size();
                for (int p = 0; p < pSize; p++) {
                    int[] pnow = person.poll();
                    int px = pnow[0];
                    int py = pnow[1];
                    int time = pnow[2];

                    // 탈출 조건: 가장자리에서 바깥으로 나가면
                    if (px == 0 || py == 0 || px == h - 1 || py == w - 1) {
                        System.out.println(time + 1);
                        escaped = true;
                        break;
                    }

                    for (int d = 0; d < 4; d++) {
                        int nx = px + dx[d];
                        int ny = py + dy[d];

                        if (nx >= 0 && ny >= 0 && nx < h && ny < w) {
                            if (!visited[nx][ny] && map[nx][ny] == '.') {
                                visited[nx][ny] = true;
                                person.add(new int[]{nx, ny, time + 1});
                            }
                        }
                    }
                }

                if (escaped) break;
            }

            if (!escaped) {
                System.out.println("IMPOSSIBLE");
            }
        }
    }
}
