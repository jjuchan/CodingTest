package programmers.test;

import java.util.List;

public class PG_131130 {
    class Solution {
        public int solution(int[] cards) {
            boolean[] visited = new boolean[cards.length];
            List<Integer> group = new java.util.ArrayList<>();

            for (int i = 0; i < cards.length; i++) {
                if (!visited[i]) {
                    int count = 0;
                    int index = i;
                    while (!visited[index]) {
                        visited[index] = true;
                        index = cards[index] - 1;
                        count++;
                    }
                    group.add(count);
                }
            }
            if (group.size() < 2) return 0;
            group.sort((a, b) -> b - a);
            int answer = group.get(0) * group.get(1);
            return answer;
        }
    }
}
