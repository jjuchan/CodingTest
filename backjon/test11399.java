package backjon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class test11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int [] A = new int[N]; // 걸리는 시간 배열
        int [] B = new int[N]; // 총 걸리는 시간 배열
        int temp = 0;
        int sum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            temp += A[i];
            B[i] = temp;

        }
        for(int i = 0; i < B.length; i++){
            sum += B[i];
        }
        System.out.println(sum);
    }
}


// 돈을 인출할 때 걸리는 최소시간. 걸리는 시간이 제일 작은 사람부터 뽑는다고 생각해야한다. 그리디 알고리즘