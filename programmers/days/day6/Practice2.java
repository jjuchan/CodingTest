package programmers.day6;

public class Practice2 {
    public static void main(String[] args) {

    }


     class Solution {
        public boolean solution(int x) {
            String str = String.valueOf(x);
            int sum = 0;
            for (char c : str.toCharArray()) {
                sum += c - '0';
            }
            if (sum == 0) {
                return false;
            }
            return x % sum == 0;
        }
    }
}
