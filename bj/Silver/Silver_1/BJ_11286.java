package bj.Silver.Silver_1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class BJ_11286 {
    public static void main(String[] args) throws IOException {
    // 절댓값을 기준으로 정렬 한 후, 절댓값이 같을 때 음수를 먼저 출력하면 되는 것이기 때문에 우선순위 큐를 사용한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->{ //a-b가 양수면 작은 값이 먼저 나옴
            int abs1 = Math.abs(a);
            int abs2 = Math.abs(b);
            //절댓값이 같은 경우 음수 우선
            if (abs1 == abs2) {
                return a > b ? 1 : -1; //o1이 더 크다면 양수 반환 -> o1과 o2의 자리를 바꾼다
                //o1이 더 작다면 음수 반환 -> 지금의 자리를 유지한다
            }
            //절댓값 작은 데이터 먼저
            return abs1-abs2; // 작은 수가 먼저 반환
            //양수가 반환되면 o1의 절댓값이 더 큰 경우이다 -> o2, o1순으로 정렬
            //음수가 반환되면 o2의 절대값이 더 큰 경우이다 -> o1, o2 유지

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
