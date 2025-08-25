package bj.Bronze.Bronze_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bf.readLine()); // 테스트 할 갯수

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            String input = bf.readLine(); // "3 ABC" 같은 형식으로 입력을 받음
            String[] parts = input.split(" "); // 공백 기준으로 나누기

            int R = Integer.parseInt(parts[0]); // 반복 횟수
            String S = parts[1];

            for(int j = 0; j < S.length(); j++) {
                char c = S.charAt(j);
                for(int k = 0; k < R; k++) {
                    sb.append(c);
                }
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
