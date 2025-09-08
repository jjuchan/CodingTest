package programmers.test2;

import java.util.Arrays;
import java.util.PriorityQueue;

class PG_155651 {
    public int solution(String[][] book_time) {

        int n = book_time.length;

        int[][] times = new int[n][2];
        for (int i = 0; i < n; i++) {
            times[i][0] = Integer.parseInt(book_time[i][0].split(":")[0]) * 60 + Integer.parseInt(book_time[i][0].split(":")[1]);
            times[i][1] = Integer.parseInt(book_time[i][1].split(":")[0]) * 60 + Integer.parseInt(book_time[i][1].split(":")[1]) + 10;
        }
        Arrays.sort(times, (a, b) -> a[0] - b[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int [] time : times){
            if(!pq.isEmpty() && pq.peek() <= time[0]){
                pq.poll();
            }
            pq.add(time[1]);
        }

        return pq.size();
    }
}
/**
 * 호텔에 투숙하는 고객의 예약 시간이 담긴 2차원 배열 book_time이 매개변수로 주어질 때,
 * 청소 시간은 10분이라고 할 때,
 * 호텔 객실의 최소 개수를 return 하도록 solution 메서드를 완성해주세요.
 */