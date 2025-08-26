package programmers.days.day6;

public class practice1 {
    public static void main(String[] args) {

        int a = 7;
        Solution s = new Solution();
        System.out.println(s.solution(a));

    }

   static class Solution {
        public int solution(int n) {
            int answer = 0;
            if (n % 7 == 0) {
                answer = n / 7;
            } else {
                answer = n / 7 + 1;
            }

            return answer;
        }
    }
}