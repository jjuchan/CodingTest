package bj.Silver.Silver_2;

import java.util.*;
import java.io.*;
public class BJ_19583 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String S = st.nextToken(); //시작시간
        String E = st.nextToken(); //총회가 끝남
        String Q = st.nextToken(); //스트리밍 끝남


        Set<String> enter = new HashSet<>(); //시작 전에 채팅을 쳤는지
        Set<String> passed = new HashSet<>();


        String line;
        while ((line = br.readLine()) != null) {
            if(line.isEmpty()) continue;

            st = new StringTokenizer(line);

            String time = st.nextToken();
            String name = st.nextToken();

            if (time.compareTo(S) <= 0) { //시작전에 도착함
                enter.add(name);
            } else if (time.compareTo(E) >=0 && time.compareTo(Q) <= 0) { //총회가 끝나고 채팅을 치거나 스트리밍이 끝날때까지만 채팅을 치면 통화
                if (enter.contains(name)) {
                    passed.add(name);
                }
            }
        }
        System.out.println(passed.size());
    }
}
// 스트리밍으로 개강총회
// 단점. 누가 왔는지 모름, 누가 남아있는지 모름,그냥 틀어놓고 안볼 수 있음
// 회원의 닉네임을 보고 왔는지 확인 대신 시작하자마자 와야함 채팅으로 구분한다. 총회 시작 전 부터 스트리밍 끝날 때 까지