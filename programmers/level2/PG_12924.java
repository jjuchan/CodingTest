package programmers.level2;

public class PG_12924 {
    public static void main(String[] args) {

    }

    class Solution {
        public int solution(int n) {
            int count = 0;

            for (int k = 1; k * (k - 1) / 2 < n; k++) {
                int numerator = n - k * (k - 1) / 2;
                if (numerator % k == 0 && numerator / k > 0) {
                    count++;
                }
            }

            return count;
        }
    }
}
