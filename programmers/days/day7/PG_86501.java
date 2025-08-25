package programmers.day7;

public class PG_86501 {
    public static void main(String[] args) {

    }



    class Solution {
        public int solution(int[] numbers) {
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            int answer = 45 - sum;
            return answer;
        }
    }
}
