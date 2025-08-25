package bj.Silver.Silver_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_14888 {

    static int N; // 입력할 수의 갯수
    static int num[]; // 수 입력 배열
    static int oper[] = new int[4]; // 연산자 개수 배열 (+, -, *, / 순서)
    static int MAX = Integer.MIN_VALUE; // 최댓값을 저장할 변수, 초기값은 Integer.MIN_VALUE로 설정
    static int MIN = Integer.MAX_VALUE; // 최솟값을 저장할 변수, 초기값은 Integer.MAX_VALUE로 설정

    public static void main(String[] args) throws IOException {
        // BufferedReader로 입력을 받음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N은 수의 갯수 입력받기
        N = Integer.parseInt(br.readLine());
        num = new int[N]; // 수의 배열 크기 설정

        // 수들 입력받기 (StringTokenizer로 공백을 기준으로 나눠서 입력)
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st.nextToken()); // 각 수를 배열에 저장
        }

        // 연산자 개수 입력받기 (+, -, *, / 순서대로)
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 4; i++) {
            oper[i] = Integer.parseInt(st.nextToken()); // 각 연산자의 개수를 배열에 저장
        }

        // 백트래킹을 통해 계산을 시작, 처음에는 첫 번째 숫자(num[0])로 시작, 두 번째 숫자는 index 1부터
        Bactracking(num[0], 1);

        // 결과 출력
        System.out.println(MAX); // 최대값 출력
        System.out.println(MIN); // 최소값 출력
    }

    private static void Bactracking(int now, int index) {
        // index가 N에 도달하면, 즉 모든 수를 다 처리하면 결과를 갱신
        if (index == N) {
            MAX = Math.max(MAX, now); // 계산된 값이 MAX보다 크면 갱신
            MIN = Math.min(MIN, now); // 계산된 값이 MIN보다 작으면 갱신
            return; // 종료
        }

        // 각 연산자에 대해 조건을 검사하고, 연산을 수행하며 백트래킹을 진행

        // + 연산자를 사용할 수 있으면
        if (oper[0] > 0) {
            oper[0]--; // 연산자를 하나 사용했으므로 개수를 하나 줄임
            Bactracking(now + num[index], index + 1); // 현재 값에 num[index]를 더한 후 다음 숫자(index + 1)로 재귀 호출
            oper[0]++; // 연산자를 다시 복구하여 다른 경우에서 사용할 수 있도록 함
        }

        // - 연산자를 사용할 수 있으면
        if (oper[1] > 0) {
            oper[1]--; // 연산자를 하나 사용
            Bactracking(now - num[index], index + 1); // 현재 값에 num[index]를 뺀 후 재귀 호출
            oper[1]++; // 연산자 복구
        }

        // * 연산자를 사용할 수 있으면
        if (oper[2] > 0) {
            oper[2]--; // 연산자를 하나 사용
            Bactracking(now * num[index], index + 1); // 현재 값에 num[index]를 곱한 후 재귀 호출
            oper[2]++; // 연산자 복구
        }

        // / 연산자를 사용할 수 있으면
        if (oper[3] > 0) {
            oper[3]--; // 연산자를 하나 사용
            Bactracking(now / num[index], index + 1); // 현재 값에 num[index]로 나눈 후 재귀 호출
            oper[3]++; // 연산자 복구
        }
    }

}

