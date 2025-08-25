package bj.Silver.Silver_5;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BJ_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            if (!list.contains(s)) {
                list.add(s);
            }
        }
        String[] res = list.toArray(new String[0]);
        Arrays.sort(res, (a, b) -> {
            if (a.length() == b.length()) {
                return a.compareTo(b);
            }
            return a.length() - b.length();
        });
        for(int i = 0; i < res.length; i++) {
            stringBuilder.append(res[i]).append("\n");
        }
        System.out.println(stringBuilder.toString());
    }

}

