package backjon;

import java.util.*;
import java.io.*;

public class test5648 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 첫 숫자가 n

        ArrayList<Long> list = new ArrayList<>();

        // 첫 줄에서 n 말고 나머지 숫자들도 읽기
        int count = 0;

        // 첫 줄에서 n이외 숫자들 읽기
        while (st.hasMoreTokens() && count < n) {
            String numStr = st.nextToken();
            long reversed = Long.parseLong(new StringBuilder(numStr).reverse().toString());
            list.add(reversed);
            count++;
        }

        // 다음 줄부터 n개 숫자가 될 때까지 계속 읽기
        while (count < n) {
            String line = br.readLine();
            st = new StringTokenizer(line);

            while (st.hasMoreTokens() && count < n) {
                String numStr = st.nextToken();
                long reversed = Long.parseLong(new StringBuilder(numStr).reverse().toString());
                list.add(reversed);
                count++;
            }
        }

        // 정렬
        Collections.sort(list);

        // 출력
        StringBuilder sb = new StringBuilder();
        for (long num : list) {
            sb.append(num).append('\n');
        }
        System.out.print(sb);
    }
}
// 양의 정수가 있으면 그걸 리버스해서 오름차순으로 정렬