package programmers.day4;

import java.util.*;
public class practice3 {
    public static void main(String[] args) {

        int[][] sizes = {
                {10, 7},
                {12, 3},
                {8, 15},
                {14, 7},
                {5, 15}
        };
        System.out.println(solution(sizes));

    }

    public static int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;

        for (int i = 0; i < sizes.length; i++) {
            int w = Math.max(sizes[i][0], sizes[i][1]);  // 더 큰 쪽을 가로로
            int h = Math.min(sizes[i][0], sizes[i][1]);  // 작은 쪽을 세로로

            maxWidth = Math.max(maxWidth, w);   // 가로 최댓값 갱신
            maxHeight = Math.max(maxHeight, h); // 세로 최댓값 갱신
        }

        return maxWidth * maxHeight;
    }
}
