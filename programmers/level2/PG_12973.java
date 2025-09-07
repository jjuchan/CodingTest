package programmers.level2;

import java.util.Stack;

public class PG_12973 {
    public static void main(String[] args) {


    }

    /**
     * 주어진 문자열 s에서 인접한 두 문자를 짝지어 제거하는 과정을 반복하여
     * 모든 문자를 제거할 수 있는지 판별하는 메서드.
     *
     * @param s 제거할 문자열
     * @return 모든 문자를 제거할 수 있다면 1, 불가능하다면 0을 반환
     */
    class Solution {

        public int solution(String s) {
            Stack<Character> stack = new Stack<>();

            for (char c : s.toCharArray()) {
                if (!stack.isEmpty() && stack.peek() == c) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }

            return stack.isEmpty() ? 1 : 0;
        }
    }
}
