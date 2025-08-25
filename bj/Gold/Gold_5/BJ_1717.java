package bj.Gold.Gold_5;

import java.util.Scanner;

public class BJ_1717 {
    static int[] parents;
    public static void main(String[] args) {
        // 0은 합집합, 1은 같은 집합인지 확인
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 원소 개수
        int M = sc.nextInt(); // 질의 개수
        parents = new int[N+1];
        for (int i = 0; i < N+1; i++) { //대표노드 초기화
            parents[i] = i;
        }
        for(int i = 0; i < M; i++){  //질의 계산
            int question = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (question == 0) { //합집합
                union(a,b);
            } else { // 두 원소가 같은지 보기
                boolean result = checkSame(a, b);
                if (result) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }

    }

    private static void union(int a, int b) {
        //대표 노드부터 찾기
        a = find(a);
        b = find(b);
        if (a != b) {
            parents[b] = a;
        }
    }

    private static int find(int a) {
        if(parents[a] == a) return a; //인덱스의 값과 그 value값이 같은지 확인
        else{
            return parents[a] = find(parents[a]); //재귀합수로 그 value를 인덱스 값으로 설정해서 그 값을 value에 넣어줌
        }
    }
    private static boolean checkSame(int a, int b){
        a = find(a);
        b = find(b);
        if(a == b) return true;
        return false;
    }
}


