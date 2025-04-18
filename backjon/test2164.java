package backjon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class test2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        while (queue.size() > 1) {
            queue.poll(); // 제일 위 카드 버리기
            queue.offer(queue.poll()); // 그 다음 카드 맨 아래로 보내기
        }

        System.out.println(queue.peek()); // 마지막 카드 출력
    }
}
