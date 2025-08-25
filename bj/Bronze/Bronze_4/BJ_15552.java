package bj.Bronze.Bronze_4;

import java.io.*;

public class BJ_15552 {
    public static void main(String[] args) throws IOException { //예외처리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //br 생성
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //bw 생성
        int n = Integer.parseInt(br.readLine()); //테스트 케이스 수 입력
        for (int i = 0; i < n; i++) {
            String s = br.readLine(); // 입력 한 줄을 읽는다. 약간 배열 생성하는 느낌
            int a = Integer.parseInt(s.split(" ")[0]); // 공백을 기준으로 a를 정수형으로 바꾼 후 0번째 인덱스를 a에 넣는다
            int b = Integer.parseInt(s.split(" ")[1]);
            bw.write(a + b + "\n"); //더한 값을 출력하고 줄바꿈

        }
        bw.flush();
    }

}
