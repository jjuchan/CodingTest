

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;  // 지도 높이 정보 배열
    static int count;    // 경사로를 놓을 수 있는 길의 개수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 지도의 크기
        int L = Integer.parseInt(st.nextToken()); // 경사로의 길이

        arr = new int[N][N]; // N x N 크기의 지도 배열

        // 지도 정보 입력 받기
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        count = 0;

        // 각 행과 열에 대해 경사로를 놓을 수 있는지 검사
        for (int i = 0; i < N; i++) {
            if (canGoRow(i, N, L)) { // i번째 행 검사
                count++;
            }
            if (canGoCol(i, N, L)) { // i번째 열 검사
                count++;
            }
        }

        System.out.println(count); // 가능한 길의 수 출력
    }

    // 특정 행(row)에 경사로를 놓을 수 있는지 판단
    private static boolean canGoRow(int row, int N, int L) {
        boolean[] used = new boolean[N]; // 경사로가 설치된 위치를 기록

        for (int i = 0; i < N - 1; i++) {
            int diff = arr[row][i + 1] - arr[row][i]; // 인접한 칸의 높이 차이

            if (diff == 0) continue; // 높이 차이가 없으면 다음으로

            if (diff == 1) { // 오르막일 경우
                if (i - L + 1 < 0) return false; // 경사로 설치 공간이 부족
                for (int j = 0; j < L; j++) {
                    // 연속된 L개의 칸이 동일한 높이이고 경사로가 설치되지 않았는지 확인
                    if (arr[row][i] != arr[row][i - j] || used[i - j]) return false;
                }
                for (int j = 0; j < L; j++) {
                    used[i - j] = true; // 경사로 설치 표시
                }
            }
            else if (diff == -1) { // 내리막일 경우
                if (i + L >= N) return false; // 경사로 설치 공간이 부족
                for (int j = 1; j <= L; j++) {
                    // 다음 L개의 칸이 동일한 높이이고 경사로가 설치되지 않았는지 확인
                    if (arr[row][i + 1] != arr[row][i + j] || used[i + j]) return false;
                }
                for (int j = 1; j <= L; j++) {
                    used[i + j] = true; // 경사로 설치 표시
                }
            }
            else {
                return false; // 높이 차이가 1을 초과하면 경사로 설치 불가
            }
        }
        return true; // 모든 조건을 만족하면 true 반환
    }

    // 특정 열(col)에 경사로를 놓을 수 있는지 판단
    private static boolean canGoCol(int col, int N, int L) {
        boolean[] used = new boolean[N]; // 경사로가 설치된 위치를 기록

        for (int i = 0; i < N - 1; i++) {
            int diff = arr[i + 1][col] - arr[i][col]; // 인접한 칸의 높이 차이

            if (diff == 0) continue; // 높이 차이가 없으면 다음으로

            if (diff == 1) { // 오르막일 경우
                if (i - L + 1 < 0) return false; // 경사로 설치 공간 부족
                for (int j = 0; j < L; j++) {
                    // 연속된 L개의 칸이 동일한 높이이고 경사로가 설치되지 않았는지 확인
                    if (arr[i][col] != arr[i - j][col] || used[i - j]) return false;
                }
                for (int j = 0; j < L; j++) {
                    used[i - j] = true; // 경사로 설치 표시
                }
            }
            else if (diff == -1) { // 내리막일 경우
                if (i + L >= N) return false; // 경사로 설치 공간 부족
                for (int j = 1; j <= L; j++) {
                    // 다음 L개의 칸이 동일한 높이이고 경사로가 설치되지 않았는지 확인
                    if (arr[i + 1][col] != arr[i + j][col] || used[i + j]) return false;
                }
                for (int j = 1; j <= L; j++) {
                    used[i + j] = true; // 경사로 설치 표시
                }
            }
            else {
                return false; // 높이 차이가 1을 초과하면 경사로 설치 불가
            }
        }
        return true; // 모든 조건을 만족하면 true 반환
    }
}
