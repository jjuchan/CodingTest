package bj.Bronze.Bronze_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2908 {
    public static void main(String[] args) throws IOException {
        // BufferedReader로 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // StringTokenizer로 두 숫자 분리
        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken(); // 첫 번째 숫자
        String B = st.nextToken(); // 두 번째 숫자

        // 숫자 뒤집기
        String reversedA = new StringBuilder(A).reverse().toString();
        String reversedB = new StringBuilder(B).reverse().toString();

        // 뒤집은 숫자를 정수로 변환
        int revA = Integer.parseInt(reversedA);
        int revB = Integer.parseInt(reversedB);

        // Math.min을 사용하여 더 작은 숫자 출력
        System.out.println(Math.max(revA, revB));
    }
}