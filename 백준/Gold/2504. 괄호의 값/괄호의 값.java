

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine(); // 괄호열을 입력받음
        Stack<Character> stack = new Stack<>(); // 괄호 확인용 스택
        int value = 1; // 곱셈 연산을 위한 변수
        int result = 0; // 최종 결과값

        for (int i = 0; i < str.length(); i++) {
            char cha = str.charAt(i); // 각 문자를 확인
            if (cha == '(') { // '('를 만나면 곱하기 2
                stack.push(cha);
                value *= 2;
            } else if (cha == '[') { // '['를 만나면 곱하기 3
                stack.push(cha);
                value *= 3;
            } else if (cha == ')') { // ')'를 만나면
                if (stack.isEmpty() || stack.peek() != '(') { // 스택이 비어있거나 짝이 안 맞으면 0 출력
                    result = 0;
                    break;
                }
                if (str.charAt(i - 1) == '(') { // 바로 이전에 '('가 있으면
                    result += value; // value 값을 result에 더함
                }
                stack.pop();
                value /= 2; // 괄호 짝을 찾았으니 value를 2로 나눔
            } else if (cha == ']') { // ']'를 만나면
                if (stack.isEmpty() || stack.peek() != '[') { // 스택이 비어있거나 짝이 안 맞으면 0 출력
                    result = 0;
                    break;
                }
                if (str.charAt(i - 1) == '[') { // 바로 이전에 '['가 있으면
                    result += value; // value 값을 result에 더함
                }
                stack.pop();
                value /= 3; // 괄호 짝을 찾았으니 value를 3으로 나눔
            }
        }

        // 스택이 비어 있지 않으면 올바른 괄호열이 아니므로 0을 출력
        if (!stack.isEmpty()) result = 0;

        System.out.println(result); // 최종 결과 출력
    }
}

