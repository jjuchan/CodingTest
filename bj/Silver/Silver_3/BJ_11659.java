package bj.Silver.Silver_3;

import java.util.Scanner;

public class BJ_11659 {
    public static void main(String[] args){
        /* 합을 할 수의 갯수인 N을 입력 받고 배열의 i번째부터 j 번째 합을 구하는 프로그램
        합 배열 공식을 사용하면 편하다. S(j) - S(i-1)을 사용하면 될 것 같다.
        합을 몇번 돌릴지 M을 입력 받음
        두번째 줄에 N만큼에 수들을 넣어준다.
        세 번째 줄에는 그 구간의 배열의 합을 나타낸다.
        */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //입력할 수의 갯수
        int M = sc.nextInt(); // 구간 합을 돌릴 횟수
        int A[] = new int[N]; // 입력한 수를 담는 배열
        int B[] = new int[N+1]; // 수의 합을 담는 배열
        int C[] = new int[M]; // 구간의 합을 담는 배열

        for (int k = 0; k<N; k++){
            A[k] = sc.nextInt();
            B[k+1] = B[k]+A[k];
        }
        for(int k =0; k<M; k++){
            int i = sc.nextInt(); // 구간 시작점
            int j = sc.nextInt(); // 구간 끝점
            C[k] = B[j]-B[i-1];
        }
        for(int k =0; k< C.length; k++){
            System.out.println(C[k]);
        }
        sc.close();
    }
}
