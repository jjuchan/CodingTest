package backjon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test23971 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken()); // 행
        int W = Integer.parseInt(st.nextToken()); // 열
        int N = Integer.parseInt(st.nextToken()); // 비워야하는 세로칸
        int M = Integer.parseInt(st.nextToken()); // 비워야하는 가로칸
        // 세로 방향으로 앉을 수 있는 사람 수 계산
        int rows = (H - 1) / (N + 1) + 1;

        // 가로 방향으로 앉을 수 있는 사람 수 계산
        int cols = (W - 1) / (M + 1) + 1;

        // 전체 앉을 수 있는 최대 인원 수 출력
        System.out.println(rows * cols);
    }
}