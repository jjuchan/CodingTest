

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] dx = {0,1,0,-1}; //x가 오른쪽으로 가면 1 왼쪽으로 가면 -1
    static int[] dy = {1,0,-1,0}; //y가 내려가면 1 올라가면 -1
    static boolean[][] visited;
    static int[][] A;
    static int N,M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); //행의 갯수
        M = Integer.parseInt(st.nextToken()); //열의 갯수
        visited = new boolean[N][M];
        A = new int[N][M];
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken(); //ex)1010110
            for(int j = 0; j < M; j++) {
                A[i][j] = Integer.parseInt(line.substring(j, j+1));
            }
        }
        BFS(0,0);
        System.out.println(A[N-1][M-1]);
    }

    private static void BFS(int i, int j) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{i, j});
        while (!q.isEmpty()) {
            int now[] = q.poll();
            visited[i][j] = true;
            for(int k = 0; k < 4; k++) { //상하좌우 탐색이라 4
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];
                if(x>=0 && x<N && y>=0 && y<M ) { //배열을 넘어가면 안되고
                    if (A[x][y] != 0 && !visited[x][y]) { // 0이여서 갈 수 없거나 방문한적 있으면 안됨
                        //갈 수 있는 곳
                        visited[x][y] = true;
                        A[x][y] = A[now[0]][now[1]] + 1; //더해주는 과정 depth
                        q.add(new int[]{x, y});
                    }
                }
            }
        }
    }
}
