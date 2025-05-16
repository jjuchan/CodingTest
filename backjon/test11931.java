package backjon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class test11931{
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list); // 오름차순 정렬

        // 출력 속도 향상을 위해 StringBuilder 사용
        StringBuilder sb = new StringBuilder();
        for (int i = N - 1; i >= 0; i--) {
            sb.append(list.get(i)).append('\n');
        }

        System.out.print(sb);
    }
}
//