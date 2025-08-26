package programmers.days.day5;

import java.util.HashSet;
import java.util.Set;

public class practice5 {
    public static void main(String[] args) {

    }

    class Solution {
        Set<Integer> primeSet = new HashSet<>();

        public int solution(String numbers) {
            boolean[] visited = new boolean[numbers.length()];
            dfs(numbers, "", visited);
            int count = 0;

            for (int num : primeSet) {
                if (isPrime(num)) {
                    count++;
                }
            }

            return count;
        }

        private void dfs(String numbers, String current, boolean[] visited) {
            if (!current.isEmpty()) {
                primeSet.add(Integer.parseInt(current));
            }

            for (int i = 0; i < numbers.length(); i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    dfs(numbers, current + numbers.charAt(i), visited);
                    visited[i] = false;
                }
            }
        }

        private boolean isPrime(int num) {
            if (num <= 1) return false;
            if (num == 2) return true;
            if (num % 2 == 0) return false;

            for (int i = 3; i <= Math.sqrt(num); i += 2) {
                if (num % i == 0) return false;
            }

            return true;
        }
    }


}
