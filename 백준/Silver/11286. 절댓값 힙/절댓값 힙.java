

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
    // 절댓값을 기준으로 정렬 한 후, 절댓값이 같을 때 음수를 먼저 출력하면 되는 것이기 때문에 우선순위 큐를 사용한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->{
            int abs1 = Math.abs(a);
            int abs2 = Math.abs(b);
            //절댓값이 같은 경우 음수 우선
            if (abs1 == abs2) {
                return a > b ? 1 : -1;
            }
            //절댓값 작은 데이터 먼저
            return abs1-abs2;
        });
        for(int i = 0; i < N; i++) {
            int request = Integer.parseInt(br.readLine());
            if (request == 0) {
                if (pq.isEmpty()) {
                    System.out.println("0");
                } else {
                    System.out.println(pq.poll());
                }
            } else {
                pq.add(request);
            }
        }
    }
}
