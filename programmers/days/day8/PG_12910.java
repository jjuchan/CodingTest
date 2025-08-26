package programmers.days.day8;

import java.util.ArrayList;
import java.util.Collections;



public class PG_12910 {
    public static void main(String[] args) {

    }

    class Solution {
        public int[] solution(int[] arr, int divisor) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i : arr) {
                if (i % divisor == 0) {
                    list.add(i);
                }
            }
            if (list.isEmpty()) {
                list.add(-1);
            }
           Collections.sort(list);

            return list.stream().mapToInt(i -> i).toArray();
        }
    }
}
