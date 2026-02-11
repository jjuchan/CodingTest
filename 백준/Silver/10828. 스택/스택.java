

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if (s.equals("push")) {
                int x = Integer.parseInt(st.nextToken());
                stack.push(x);
            } else if (s.equals("pop")) {
                if (!stack.isEmpty()) {
                    stringBuilder.append(stack.pop()).append("\n");
                } else {
                    stringBuilder.append(-1).append("\n");
                }
            }
            else if (s.equals("size")) {
                stringBuilder.append(stack.size()).append("\n");
            }
            else if (s.equals("empty")) {
                if (!stack.isEmpty()) {
                    stringBuilder.append(0).append("\n");
                } else {
                    stringBuilder.append(1).append("\n");
                }
            } else if (s.equals("top")) {
                if (!stack.isEmpty()) {
                    stringBuilder.append(stack.peek()).append("\n");
                } else {
                    stringBuilder.append(-1).append("\n");
                }
            }
        }
        System.out.println(stringBuilder);
    }
}