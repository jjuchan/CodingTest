package backjon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class test28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); // 결과를 모아서 한 번에 출력
        int N = Integer.parseInt(br.readLine()); // 명령의 횟수
        Stack<Integer> stack = new Stack<>(); // 스택 선언

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()); // 명령 읽기

            if (a == 1) {
                // 1 X: 정수 X를 스택에 넣는다.
                int x = Integer.parseInt(st.nextToken());
                stack.push(x);
            } else if (a == 2) {
                // 2: 스택에서 정수를 빼고 출력한다. 없다면 -1을 출력
                if (stack.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(stack.pop()).append("\n");
                }
            } else if (a == 3) {
                // 3: 스택에 저장된 정수의 개수를 출력한다.
                sb.append(stack.size()).append("\n");
            } else if (a == 4) {
                // 4: 스택이 비어있으면 1, 아니면 0을 출력
                sb.append(stack.isEmpty() ? 1 : 0).append("\n");
            } else if (a == 5) {
                // 5: 스택의 맨 위 값을 출력한다. 없다면 -1을 출력
                if (stack.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(stack.peek()).append("\n");
                }
            }
        }

        System.out.print(sb.toString()); // 결과를 한 번에 출력
    }
}
