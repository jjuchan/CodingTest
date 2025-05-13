package programmers.dfs;

import java.util.*;
import java.io.*;

public class Game {
    static int[] dx = {-1, 1, 0, 0}; // 상, 하, 좌, 우
    static int[] dy = {0, 0, -1, 1};
    static int[][] maps;
    static boolean[][] visited;
    static int N;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        maps = new int[N][N];
        visited = new boolean[N][N];

        // 입력 받기
        sc.nextLine(); // nextInt() 후에 남아있는 \n 처리
        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < N; j++) {
                maps[i][j] = line.charAt(j) - '0';
            }
        }

        // bfs 호출 후 결과 출력
        int result = bfs(0, 0);
        if (result == -1) {
            System.out.println(-1); // 목표 지점에 도달 불가한 경우
        } else {
            System.out.println(result); // 목표 지점까지의 최소 경로 길이
        }
    }

    private static int bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});
        visited[x][y] = true;
        maps[x][y] = 1; // 시작 지점은 1로 시작 (이미 출발 지점이기 때문에)

        while (!q.isEmpty()) {
            int[] now = q.poll();
            int nowx = now[0];
            int nowy = now[1];

            for (int i = 0; i < 4; i++) {
                int nx = nowx + dx[i];
                int ny = nowy + dy[i];

                if (nx >= 0 && ny >= 0 && nx < N && ny < N && !visited[nx][ny] && maps[nx][ny] == 1) {
                    // 유효한 칸이라면
                    visited[nx][ny] = true;
                    maps[nx][ny] = maps[nowx][nowy] + 1; // 이동한 칸의 값은 이전 칸의 값 + 1
                    q.add(new int[]{nx, ny});

                    // 목표지점에 도달한 경우
                    if (nx == N-1 && ny == N-1) {
                        return maps[nx][ny];
                    }
                }
            }
        }
        return -1; // 목표지점에 도달할 수 없는 경우
    }
}
