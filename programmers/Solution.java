package programmers;

class Solution {
    public String solution(String new_id) {
        String nickname = new_id.toLowerCase();

        StringBuilder sb = new StringBuilder();
        char[] name = nickname.toCharArray();

        for (int i = 0; i < name.length; i++) {
            char c = name[i];
            if (Character.isLowerCase(c) || Character.isDigit(c) || c == '-' || c == '_') {
                sb.append(c);
            } else if (c == '.') {
                if (sb.length() == 0 || sb.charAt(sb.length() - 1) != '.') { //비어있거나 마지막이 . 이 아니면
                    sb.append(c);
                }
            }
        }

        if (sb.length() > 0 && sb.charAt(0) == '.') {
            sb.deleteCharAt(0);
        }
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == '.') {
            sb.deleteCharAt(sb.length() - 1);
        }

        if (sb.length() == 0) {
            sb.append('a');
        }

        if (sb.length() >= 16) {
            sb.delete(15, sb.length());
            if (sb.charAt(sb.length() - 1) == '.') {
                sb.deleteCharAt(sb.length() - 1);
            }
        }

        while (sb.length() < 3) {
            sb.append(sb.charAt(sb.length() - 1));
        }

        return sb.toString();
    }
}
