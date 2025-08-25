package bj.Silver.Silver_3;


import java.util.*;
import java.io.*;

public class BJ_9375 {
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
// 안경 코드 상의 신발 바지 렌즈로 조합 짜기
// 입력 1. 테스트 케이스 T
// 입력 2. 가진 의상의 갯수 n
// 입력 3. n개의 의상 종류가 공백을 구분되어 주어진다. 같은 종류의 의상은 하나만 입을 수 있다. 최소 하나는 입어야함
// 출력 1. 의상이 하나도 있는 갯수 중복을 제외하고