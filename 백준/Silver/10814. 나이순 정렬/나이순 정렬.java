

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[][] S = new String[N][3]; // 나이, 이름, 입력 순서

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            S[i][0] = st.nextToken();         // 나이
            S[i][1] = st.nextToken();         // 이름
            S[i][2] = String.valueOf(i);      // 입력 순서 저장
        }

        Arrays.sort(S, (a, b) -> {
            int ageCompare = Integer.parseInt(a[0]) - Integer.parseInt(b[0]);
            if (ageCompare == 0) {
                return Integer.parseInt(a[2]) - Integer.parseInt(b[2]); // 입력 순서 비교
            }
            return ageCompare;
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(S[i][0]).append(" ").append(S[i][1]).append("\n");
        }

        System.out.print(sb);
    }
}

