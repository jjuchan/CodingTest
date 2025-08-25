package bj.Silver.Silver_1;

import java.util.*;

public class BJ_7562 {
    // 나이트가 이동할 수 있는 8가지 방향 (L자 모양)
    static int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
    static int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};

    static int[][] board;       // 이동 횟수 기록용
    static boolean[][] visited; // 방문 여부 체크용
    static int l;               // 체스판의 한 변 길이

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 수

        for (int t = 0; t < T; t++) {
            l = sc.nextInt(); // 체스판 크기 (l x l)
            board = new int[l][l];
            visited = new boolean[l][l];

            int startx = sc.nextInt(); // 시작 좌표
            int starty = sc.nextInt();
            int endx = sc.nextInt();   // 목표 좌표
            int endy = sc.nextInt();

            // bfs 수행 후 결과 출력
            System.out.println(bfs(startx, starty, endx, endy));
        }
    }

    // BFS로 최소 이동 횟수 찾기
    public static int bfs(int startx, int starty, int endx, int endy) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{startx, starty});
        visited[startx][starty] = true;

        while (!q.isEmpty()) {
            int[] now = q.poll();
            int curx = now[0];
            int cury = now[1];

            // 목적지 도착 시 이동 횟수 반환
            if (curx == endx && cury == endy) {
                return board[curx][cury];
            }

            // 8방향 이동
            for (int i = 0; i < 8; i++) {
                int nx = curx + dx[i];
                int ny = cury + dy[i];
                // 체스판 범위 안이고 아직 방문 안 했으면
                if (nx >= 0 && ny >= 0 && nx < l && ny < l && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    board[nx][ny] = board[curx][cury] + 1; // 이동 횟수 갱신
                    q.add(new int[]{nx, ny});
                }
            }
        }
        return 0; // 도달 못하는 경우 (문제 조건상 없음)
    }
}
