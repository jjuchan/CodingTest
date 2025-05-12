package backjon;

import java.util.*;
import java.io.*;

public class test2583 {
    static boolean[][] visited;
    static int N, M, K;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0,0,1,-1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken()); //세로
        N = Integer.parseInt(st.nextToken()); //가로
        K = Integer.parseInt(st.nextToken());

        visited = new boolean[M][N];

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int startx = Integer.parseInt(st.nextToken()); // 시작 좌표
            int starty = Integer.parseInt(st.nextToken());
            int endx = Integer.parseInt(st.nextToken()); // 끝나는 좌표
            int endy = Integer.parseInt(st.nextToken());

            for (int y = starty; y < endy; y++) {
                for (int x = startx; x < endx; x++) {
                    visited[y][x] = true;
                }
            }
        }
        List<Integer> areaSizes = new ArrayList<>();
        for (int y = 0; y < M; y++) {
            for (int x = 0; x < N; x++) {
                if (!visited[y][x]) { // 배열 인덱스가 아니라 수학적 좌표이기때문에 y가 x 좌표
                    areaSizes.add(bfs(y,x));
                }
            }
        }
        Collections.sort(areaSizes);
        System.out.println(areaSizes.size());
        for (int size : areaSizes) {
            System.out.print(size + " ");
        }
    }

    private static int bfs(int y, int x) {
        Queue<int []> q = new LinkedList<>();
        q.add(new int[]{y,x});
        visited[y][x] = true;
        int area = 1; //기본 면적은 1

        while (!q.isEmpty()) {
            int []now = q.poll();
            int cury = now[0];
            int curx = now[1];

            for (int i = 0; i < 4; i++) {
                int ny = cury + dy[i];
                int nx = curx + dx[i];

                if (ny >= 0 && nx >= 0 && ny < M && nx < N && !visited[ny][nx]) {
                    visited[ny][nx] = true;
                    q.add(new int[]{ny, nx});
                    area++;
                }
            }
        }
        return area;
    }
}
// 가로N 세로M 직사각형이 채워지면 1로 하고 0인 곳을 찾아서 넓이랑 영역 수 구하기
//입력 1. N M K(사각형의 갯수)가 주어진다. 배열과 다르게 수학적 x y 좌표로 감
