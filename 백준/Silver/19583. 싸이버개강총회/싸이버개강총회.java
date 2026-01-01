import java.util.*;
import java.io.*;
public class Main {
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