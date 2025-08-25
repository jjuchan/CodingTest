package bj.Bronze.Bronze_5;

import java.io.*;
import java.util.StringTokenizer;

public class BJ_10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder(); // writer 역할
        String str;

        while ((str = br.readLine()) != null) { // 한 줄씩 데이터를 읽는다.
            st = new StringTokenizer(str," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(a+b).append("\n"); //sb에 a+b를 넣어주고 공백도 추가해준다.
            }
        System.out.println(sb);
        }
    }

//EOF 사용: 즉 입력에서 더이상의 읽을 수가 있는 데이터가 존재할 때 반복문을 종료 null일때 종료