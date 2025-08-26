package programmers.days.day7;

public class PG_76501 {
    public static void main(String[] args) {

    }


    class Solution {
        public int solution(int[] absolutes, boolean[] signs) {
            int sum = 0;
            for (int i = 0; i < absolutes.length; i++) {
                if (signs[i]) {
                    sum += absolutes[i];
                } else {
                    sum -= absolutes[i];
                }
            }

            int answer = sum;
            return answer;
        }
    }
}
