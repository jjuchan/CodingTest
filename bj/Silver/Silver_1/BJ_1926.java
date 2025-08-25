package bj.Silver.Silver_1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BJ_1926 {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static boolean[][] visited;
    static int n, m;
    static int[][] paper;
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    m = sc.nextInt();
    visited = new boolean[n][m];
    paper = new int[n][m];
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < m; j++) {
            paper[i][j] = sc.nextInt();
        }
    }
    int sum = 0; //그림의 수
    int maxsize = 0; //그림의 넓이
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < m; j++) {
            if (paper[i][j] == 1 && !visited[i][j]) {
                sum ++;
                maxsize = Math.max(maxsize,bfs(i,j));
            }
        }
    }
    System.out.println(sum);
    System.out.println(maxsize);
    }

    private static int bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {x, y}); //좌표를 배열에 넣어줌
        visited[x][y] = true;
        int size = 1; //그림의 크기는 시작이 1이다.

        while (!q.isEmpty()) {
            int [] currnet = q.poll(); // 저장한 좌표를 뺀다.
            int currnetx = currnet[0];
            int currnety = currnet[1];

            for (int i = 0; i < 4; i++) {
                int nx = currnetx + dx[i]; //위 아래 탐색
                int ny = currnety + dy[i]; //우 좌 탐색

                if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                    if (!visited[nx][ny] && paper[nx][ny] == 1) {
                        q.add(new int[]{nx, ny});
                        visited[nx][ny] = true;
                        size++;
                    }
                }
            }
        }
        return size;
    }
}
//입력1. 그림의 가로 n 세로 m이 주어짐
//입력2. 그림의 정보가 주어짐 1이 색칠 0 은 빈곳
//출력1. 그림의 갯수
//출력2. 그림의 넓이