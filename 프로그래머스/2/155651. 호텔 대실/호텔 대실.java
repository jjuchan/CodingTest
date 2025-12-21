import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {
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