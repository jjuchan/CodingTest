package bj.Silver.Silver_4;


import java.util.*;
import java.io.*;

public class BJ_17219 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        HashMap<String, String> memo = new HashMap<>();

        int N = Integer.parseInt(st.nextToken()); // 메모장에 적을 사이트 수
        int M = Integer.parseInt(st.nextToken()); // 찾을 비밀번호 수

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String site = st.nextToken();
            String password = st.nextToken();
            memo.put(site, password); //메모장에 적어둠
        }

        for (int i = 0; i < M; i++) {
            String answer = br.readLine();
            System.out.println(memo.get(answer));
        }

    }
}
// 메모장에 사이트마다 비밀번호를 적어둠 그래서 사이트에 맞게 비밀번호를 찾아주는 프로그램
// 입력 1. 사이트 주소의 수 N  찾으려는 사이트 수 M
// 입력 2. N 개의 사이트 주소와 비밀번호 M개의 사이트 주소
// 출력 1. 찾으려고 하는 사이트의 키를 가지고 값을 출력해주면 된다.