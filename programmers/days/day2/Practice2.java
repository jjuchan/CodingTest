package programmers.days.day2;

public class Practice2 {
    class Solution {
        public int[] solution(int n) {
            // n까지의 홀수를 다 출력

            int[] answer = new int[(n+1)/2]; // 홀수를 구하는 공식 (n+1)/2 짝수는 2n
            int count = 0;

            for(int i = 1; i <= n; i++) {
                if(i % 2 == 1) {
                    answer[count] = i;
                    count ++;
                }
            }
            return answer;
        }
    }
}
