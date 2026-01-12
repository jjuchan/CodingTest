
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        LinkedHashSet<String> set = new LinkedHashSet<>();

        for (int i = 0; i < L; i++) {
            String number = br.readLine();
            if (set.contains(number)) {
                set.remove(number);  // 기존 거 삭제
            }
            set.add(number);          // 항상 맨 뒤에 추가됨
        }

        int count = 0;
        for (String s : set) {
            if (count == K) break;
            System.out.println(s);
            count++;
        }
    }
}