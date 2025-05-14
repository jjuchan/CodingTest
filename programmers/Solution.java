package programmers;


import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();

        // 참가자 목록 저장
        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }

        // 완주자 제거
        for (String c : completion) {
            map.put(c, map.get(c) - 1);
        }

        // 값이 1인 사람 = 완주 못함
        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                return key;
            }
        }

        return ""; // 예외 처리
    }
}
