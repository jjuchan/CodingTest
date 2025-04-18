package backjon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class test1427 {
    public static void main(String[] args) throws IOException {
        // 배열의 수를 내림차순으로 정렬

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 받기
        StringBuilder builder = new StringBuilder(br.readLine());

        // 문자열을 char 배열로 변환하고 정렬 (내림차순)
        char[] arr = builder.toString().toCharArray();
        Arrays.sort(arr);  // 오름차순으로 정렬
        // 내림차순으로 변경
        StringBuilder sb = new StringBuilder(new String(arr));

        // 결과 출력
        System.out.println(sb.reverse());
    }
}

