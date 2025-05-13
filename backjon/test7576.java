package backjon;

import java.io.*;
import java.util.*;

public class test7576 {
    static int[] dx = {-1, 1, 0, 0}; // 상하좌우
    static int[] dy = {0, 0, -1, 1};
    static int[][] box;
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken()); // 가로
        N = Integer.parseInt(st.nextToken()); // 세로

        box = new int[N][M];
        Queue<int[]> q = new LinkedList<>();

        // 입력 받기
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                box[i][j] = Integer.parseInt(st.nextToken());
                if (box[i][j] == 1) {
                    q.add(new int[]{i, j}); // 익은 토마토를 미리 큐에 담음
                }
            }
        }

        bfs(q);

        int result = getResult();
        System.out.println(result);
    }

    // BFS 함수: 동시에 퍼지는 익은 토마토 확산하여 날짜를 입력
    public static void bfs(Queue<int[]> q) {
        while (!q.isEmpty()) {
            int[] now = q.poll();
            int x = now[0];
            int y = now[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < N && ny < M) {
                    if (box[nx][ny] == 0) {
                        box[nx][ny] = box[x][y] + 1;
                        q.add(new int[]{nx, ny});
                    }
                }
            }
        }
    }

    // 결과 계산 함수
    public static int getResult() {
        int max = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (box[i][j] == 0) {
                    return -1; // 익지 않은 토마토가 존재
                }
                max = Math.max(max, box[i][j]);
            }
        }
        return max - 1; // 처음 익은 토마토를 1로 시작했기 때문에 -1
    }
}
