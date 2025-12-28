import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] map;
    static boolean[][] visited;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String house = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = house.charAt(j) - '0';
            }
        }
        List<Integer> houses = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    houses.add(bfs(i,j));
                }
            }
        }
        Collections.sort(houses);
        System.out.println(houses.size());
        for (int size : houses) {
            System.out.println(size);
        }
    }

    private static Integer bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        visited[x][y] = true;
        q.add(new int[]{x, y});
        int area = 1; //집의 기본 크기는 1

        while (!q.isEmpty()) {
            int[] now = q.poll();
            int nowx = now[0];
            int nowy = now[1];

            for (int i = 0; i < 4; i++) {
                int nx = nowx + dx[i];
                int ny = nowy + dy[i];

                if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
                    if (map[nx][ny] == 1 && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        q.add(new int[] {nx,ny});
                        area++;
                    }
                }
            }
        }
        return area;
    }
}