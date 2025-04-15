package backjon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class test1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 입력 할 재료의 수
        int M = Integer.parseInt(br.readLine()); // 갑옷을 만들 때 필요한 재료의 수
        int[] A = new int[N]; // 재료들을 담을 배열
        StringTokenizer st = new StringTokenizer(br.readLine()); // 한줄에 재료의 고유 번호를 입력 함
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken()); // 문자열로 받았으니까 형 변환은 필수!
        }
        Arrays.sort(A); // 오름 차순 정렬
        int count = 0;
        int i = 0; // 처음 시작 인덱스 A[0] min
        int j = N - 1; // 마지막 인덱스 A[N-1] -> max
        while (i < j) {
            if (A[i] + A[j] < M) {
                i++;
            } else if (A[i] + A[j] > M) {
                j--;
            } else {
                count++; // M이랑 값이 같게 되면 Min값은 커져야하고 Max 값은 작아져야한다.
                i++;
                j--;
            }
        }
        System.out.println(count);
    }
}