import java.util.*;
import java.io.*;

public class Main {
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