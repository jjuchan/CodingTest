package programmers.level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PG_12941 {
    public static void main(String[] args) {

    }

    static class Solution {
        public int solution(int[] A, int[] B) {
            List<Integer> listA = new ArrayList<>();
            List<Integer> listB = new ArrayList<>();

            for (int i : A) listA.add(i);
            for (int i : B) listB.add(i);

            Collections.sort(listA);  // 오름차순
            Collections.sort(listB, Collections.reverseOrder());  // 내림차순

            int sum = 0;
            for (int i = 0; i < A.length; i++) {
                sum += listA.get(i) * listB.get(i);
            }

            return sum;
        }
    }
}
