package programmers.days.day5;

import java.util.*;
import java.io.*;

public class practice1 {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());
            int Z = Integer.parseInt(st.nextToken());

            String result = bfs(X, Y, Z);
            System.out.println(result);
        }
    }

    private static String bfs(int targetX, int targetY, int limitTime) {
        int OFFSET = 50; // 좌표 오프셋
        int MAX = 101; // 좌표 최대 크기 (예: -50~50)
        boolean[][][] visited = new boolean[MAX][MAX][limitTime + 1];
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0 + OFFSET, 0 + OFFSET, 0}); // 시작점에 오프셋 적용
        visited[0 + OFFSET][0 + OFFSET][0] = true;

        targetX += OFFSET; // 목표 좌표에도 오프셋 적용
        targetY += OFFSET;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];
            int time = cur[2];

            if (x == targetX && y == targetY && time == limitTime) {
                return "YES";
            }

            if (time >= limitTime) continue;

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                int ntime = time + 1;

                if (nx >= 0 && ny >= 0 && nx < MAX && ny < MAX && ntime <= limitTime && !visited[nx][ny][ntime]) {
                    visited[nx][ny][ntime] = true;
                    q.offer(new int[]{nx, ny, ntime});
                }
            }
        }
        return "NO";
    }
}
