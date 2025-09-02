package programmers.level2;


public class PG_12951 {
    public static void main(String[] args) {

    }
    class Solution {
        public String solution(String s) {
            String[] words = s.split(" ", -1); // 연속 공백 유지
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < words.length; i++) {
                String str = words[i];
                if (!str.isEmpty()) {
                    char first = str.charAt(0);
                    sb.append(Character.isLetter(first) ? Character.toUpperCase(first) : first);
                    if (str.length() > 1) {
                        sb.append(str.substring(1).toLowerCase());
                    }
                }
                if (i < words.length - 1) sb.append(" ");
            }

            return sb.toString();
        }
    }
}



