package backjon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test14503 {
    // 북 동 남 서
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static boolean[][] visited;
    static int[][] A;
    static int N, M, count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        A = new int[N][M];  // 공간 배열
        visited = new boolean[N][M];  // 방문 여부 배열

        // 로봇 청소기의 초기 위치 및 방향
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());

        // 방 상태 입력
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 로봇 청소 시작
        count = 0;
        clean(x, y, a);
        System.out.println(count);
        br.close();
    }

    private static void clean(int x, int y, int a) {
        if (A[x][y] == 0) {
            A[x][y] = 2; // 청소완료
            count ++;
        }

        // 4방향에 대해 시도 (왼쪽으로 회전하면서)
        for (int i = 0; i < 4; i++) {
            // 왼쪽으로 회전
            a = (a + 3) % 4;
            int nx = x + dx[a];
            int ny = y + dy[a];

            // 청소할 수 있는 칸이면 이동
            if (nx >= 0 && ny >= 0 && nx < N && ny < M && A[nx][ny] == 0) {
                clean(nx, ny, a);
                return;  // 청소하고 나면 바로 돌아가며 다음 방향으로 탐색
            }
        }

        // 네 방향 모두 청소할 곳이 없으면 뒤로 한 칸
        int back = (a + 2) % 4; //180도 돌기
        int bx = x + dx[back];
        int by = y + dy[back];

        // 뒤로 갈 곳이 벽이 아니면 한 칸 뒤로
        if (bx >= 0 && by >= 0 && bx < N && by < M && A[bx][by] != 1) {
            clean(bx, by, a);
        }
    }
}
