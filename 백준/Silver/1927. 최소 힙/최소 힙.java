

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main { // 백준 제출 시 클래스 이름은 Main 이어야 합니다.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = scanner.nextInt(); // 연산의 개수

        // 최소 힙 (Min Heap) 구현: 숫자가 작을수록 높은 우선순위를 가집니다.
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();

            if (x == 0) {
                if (minHeap.isEmpty()) {
                    sb.append(0).append("\n");
                } else {
                    sb.append(minHeap.poll()).append("\n");
                }
            } else { // 0이 아닌 양의 정수가 입력된 경우 (힙에 추가)
                minHeap.add(x); // 힙에 값 추가
            }
        }

        System.out.print(sb.toString()); // 모아둔 결과 한 번에 출력
        scanner.close();
    }
}