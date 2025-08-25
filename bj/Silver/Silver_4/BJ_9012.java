package bj.Silver.Silver_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String s = br.readLine();
            Stack<Character> stack = new Stack<>();
            boolean isVPS = true;

            for (int j = 0; j < s.length(); j++) {
                char ch = s.charAt(j);

                if (ch == '(') {
                    stack.push(ch);
                } else if (ch == ')') {
                    if (stack.isEmpty()) {
                        isVPS = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }

            // 전체 문자열 다 돌고 난 뒤에 검사해야 함
            if (!stack.isEmpty()) {
                isVPS = false;
            }

            System.out.println(isVPS ? "YES" : "NO");
        }
    }
}
