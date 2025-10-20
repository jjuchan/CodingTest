package programmers.test;

import java.util.LinkedList;
import java.util.Queue;

public class PG_169199 {
    class Solution {
        static int N;
        static int M;
        static String[] boards;
        static boolean[][] visited;
        static int[] dx = {-1, 1, 0, 0}; // 상하
        static int[] dy = {0, 0, -1, 1}; // 좌우

        public int solution(String[] board) {
            N = board.length;
            M = board[0].length();
            boards = board;
            visited = new boolean[N][M];

            int[] start = new int[2];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (board[i].charAt(j) == 'R') {
                        start[0] = i;
                        start[1] = j;
                        break;
                    }
                }
            }

            return bfs(start[0], start[1]);
        }

        private int bfs(int i, int j) {
            Queue<int[]> queue = new LinkedList<>();
            queue.offer(new int[]{i, j, 0});
            visited[i][j] = true;

            while (!queue.isEmpty()) {
                int[] cur = queue.poll();
                int x = cur[0];
                int y = cur[1];
                int moves = cur[2];


                if (boards[x].charAt(y) == 'G') return moves;


                for (int d = 0; d < 4; d++) {
                    int nx = x;
                    int ny = y;

                    while (true) {
                        int tx = nx + dx[d];
                        int ty = ny + dy[d];

                        if (tx < 0 || tx >= N || ty < 0 || ty >= M || boards[tx].charAt(ty) == 'D') break;

                        nx = tx;
                        ny = ty;
                    }

                    if (visited[nx][ny]) continue;

                    visited[nx][ny] = true;
                    queue.offer(new int[]{nx, ny, moves + 1});
                }
            }


            return -1;
        }
    }
}
