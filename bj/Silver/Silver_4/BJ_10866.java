package bj.Silver.Silver_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BJ_10866 {
    public static void main(String[] args) throws IOException {
        //덱은 앞 뒤로 넣고 뺄 수 있음 add , poll
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            if (s.equals("push_back")) {
                int x = Integer.parseInt(st.nextToken());
                stack.addLast(x);
            } else if (s.equals("push_front")) {
                int x = Integer.parseInt(st.nextToken());
                stack.addFirst(x);
            } else if (s.equals("pop_front")) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.pollFirst());
                }
            } else if (s.equals("pop_back")) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.pollLast());
                }
            } else if (s.equals("size")) {
                System.out.println(stack.size());
            } else if (s.equals("empty")) {
                System.out.println(stack.isEmpty() ? 1 : 0); // 문제 조건: 비었으면 1, 아니면 0
            } else if (s.equals("front")) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.peekFirst());
                }
            } else if (s.equals("back")) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.peekLast());
                }
            }
        }

    }
}
