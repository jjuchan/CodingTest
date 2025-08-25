package bj.Gold.Gold_3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BJ_2252 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            list.add(new ArrayList<>());
        }
        int[] indegree = new int[N + 1]; // 진입 차수 배열
        for(int i = 0; i < M; i++){
            int S = sc.nextInt();
            int E = sc.nextInt();
            list.get(S).add(E); //S 리스트 끝에 E를 추가
            indegree[E]++; // 진입 차수 배열에 데이터저장
        }
        //위상정렬
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i <= N; i++){
            if(indegree[i] == 0){
                q.offer(i);
            }
        }
        while(!q.isEmpty()){
            int now = q.poll();
            System.out.print(now + " ");
            for (int next : list.get(now)) {
                indegree[next]--;
                if(indegree[next] == 0){
                    q.offer(next);
                }
            }
        }
    }
}

