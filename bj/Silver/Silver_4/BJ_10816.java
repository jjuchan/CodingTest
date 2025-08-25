package bj.Silver.Silver_4;

import java.io.*;
import java.util.*;

public class BJ_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            map.put(num, map.getOrDefault(num, 0) + 1); // 해시맵 num이 있는지 없는지 검사할 건데 기본은 0으로 설정하고 있다면 1씩 증가
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) {
            int find = Integer.parseInt(st.nextToken());
            sb.append(map.getOrDefault(find, 0)).append(" "); //찾을 수가 있다면 갯수를 stringbuilder에 붙여줌
        }

        System.out.println(sb);
    }
}
