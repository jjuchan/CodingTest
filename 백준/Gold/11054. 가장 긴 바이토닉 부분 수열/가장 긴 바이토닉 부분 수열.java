

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 수열의 크기
        int[] arr = new int[N]; // 배열 담기
        int [] high = new int [N+1]; //왼쪽에서 오른쪽으로 증가하는 배열
        int [] low = new int [N+1];  //으른쪽에서 왼쪽으로 증가

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        //증가 수열
        for(int i = 0; i < N; i++) {
            high[i] = 1; //1로 일단 다 초기화
            for(int j = 0; j < i; j++) {
                if(arr[j] < arr[i]) {
                    high[i] = Math.max(high[i], high[j] + 1);
                }
            }
        }
        for(int i = N-1; i >= 0; i--) {
            low[i] = 1;
            for (int j = N - 1; j > i; j--) {
                if(arr[j] < arr[i]) {
                    low[i] = Math.max(low[i], low[j] + 1);
                }
            }
        }
        int max = 0;
        for(int i = 0; i < N; i++) {
            max = Math.max(max,(high[i] + low[i]) - 1);
        }
        System.out.println(max);
    }
}