import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());


        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());
            HashMap<String, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String wear = st.nextToken();
                String kind = st.nextToken(); //headgear 이런걸 넣어둠
                map.put(kind, map.getOrDefault(kind, 0) + 1);
            }
            int result = 1;
            for (int count : map.values()) {
                result *= (count + 1); //안입는 경우의 수도 더해야함
            }
            System.out.println(result - 1); // 아무것도 안입는 걸 나중에 빼줘야함
        }
    }
}