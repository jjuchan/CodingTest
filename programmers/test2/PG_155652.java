package programmers.test2;

class PG_155652 {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        boolean[] skipped = new boolean[26];
        for(char c : skip.toCharArray()) {
            skipped[c - 'a'] = true;
        }
        for (char c : s.toCharArray()) {
            int count = 0;
            char cur = c;
            while (count < index) {
                cur++;
                if (cur > 'z') {
                    cur = 'a';
                }
                if (!skipped[cur - 'a']) {
                    count++;
            }
        }
            sb.append(cur);
        }
        return sb.toString();
    }
}
/**
 * s 와 skip, index 가 주어졌을 때
 * s 의 각 알파벳을 index 만큼 뒤의 알파벳으로 바
 * 꾸되, skip 에 포함된 알파벳은 제외하고 바꾼 문자열을 반환하는 메서드
 */
