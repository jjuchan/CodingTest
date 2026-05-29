import java.util.Arrays;
class Solution {
    public String solution(String s) {
        
        char[] a = s.toCharArray();
        
        Arrays.sort(a);
        
        String answer = new StringBuilder(new String(a)).reverse().toString();
        return answer;
    }
}