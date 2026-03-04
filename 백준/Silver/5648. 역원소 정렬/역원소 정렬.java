import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 첫 숫자가 n

        ArrayList<Long> list = new ArrayList<>();

       
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

     
        Collections.sort(list);

     
        StringBuilder sb = new StringBuilder();
        for (long num : list) {
            sb.append(num).append('\n');
        }
        System.out.print(sb);
    }
}