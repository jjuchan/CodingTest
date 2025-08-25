package bj.Silver.Silver_3;

import java.util.*;
import java.io.*;

public class BJ_2910 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 입력 할 수의 갯수
        int C = Integer.parseInt(st.nextToken()); // 수의 최대 크기

        LinkedHashMap<Integer, Integer> Map = new LinkedHashMap<>();

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num <= C) {
                Map.put(num, Map.getOrDefault(num, 0) + 1);
            }
        }

        List<Integer> list = new ArrayList<>(Map.keySet());

        Collections.sort(list, (a, b) -> Map.get(b) - Map.get(a)); // 빈도순이 큰 순으로 숫자를 정렬

        // 출력
        StringBuilder sb = new StringBuilder();
        for (int num : list) {
            int freq = Map.get(num);
            for (int i = 0; i < freq; i++) {
                sb.append(num).append(" ");
            }
        }

        System.out.println(sb);
    }
}
