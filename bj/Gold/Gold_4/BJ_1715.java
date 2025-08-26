package bj.Gold.Gold_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class BJ_1715 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            pq.add(Integer.parseInt(bufferedReader.readLine()));
        }

        if (N == 1) {
            System.out.println(0);
            return;
        }

        int totalComparisons = 0;

        while (pq.size() > 1) {
            int cardBundle1 = pq.poll();
            int cardBundle2 = pq.poll();

            int currentComparison = cardBundle1 + cardBundle2;

            totalComparisons += currentComparison;

            pq.add(currentComparison);
        }

        System.out.println(totalComparisons);
    }
}
