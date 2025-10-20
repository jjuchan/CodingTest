package programmers.test;

import java.util.HashMap;

public class PG_176963 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        HashMap<String, Integer> map = new HashMap<>();


        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        int[] answer = new int[photo.length];


        for (int i = 0; i < photo.length; i++) {
            int sum = 0;
            for (String person : photo[i]) {
                sum += map.getOrDefault(person, 0);
            }
            answer[i] = sum;
        }

        return answer;
    }
}
