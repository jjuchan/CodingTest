package programmers.stackque;

import java.util.Arrays;

public class Practice1 {


    class Solution {
        public int[] solution(int[] array, int[][] commands) {
            int[] result = new int[commands.length];  // 결과 배열 생성

            // 각 commands에 대해 작업 수행
            for (int i = 0; i < commands.length; i++) {
                int[] command = commands[i];  // 현재 command
                int start = command[0] - 1;   // i번째 숫자 (0-based index로 변환)
                int end = command[1];         // j번째 숫자
                int k = command[2] - 1;       // k번째 숫자 (0-based index로 변환)

                // 배열 자르고 정렬하기
                int[] subArray = Arrays.copyOfRange(array, start, end);
                Arrays.sort(subArray);

                // k번째 숫자 저장 (0-based index)
                result[i] = subArray[k];
            }

            return result;  // 결과 반환
        }
    }
}
