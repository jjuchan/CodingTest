package backjon;

import java.util.*;
import java.io.*;

public class test10825 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        List<String[]> student = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String korean = st.nextToken();
            String eng = st.nextToken();
            String math = st.nextToken();

            student.add(new String[]{name, korean, eng, math});
        }

        Collections.sort(student, new Comparator<String[]>() {
            public int compare(String[] o1, String[] o2) {
                int k1 = Integer.parseInt(o1[1]);
                int k2 = Integer.parseInt(o2[1]);
                if (k1 != k2) return k2 - k1;  // 국어 내림차순

                int e1 = Integer.parseInt(o1[2]);
                int e2 = Integer.parseInt(o2[2]);
                if (e1 != e2) return e1 - e2;  // 영어 오름차순

                int m1 = Integer.parseInt(o1[3]);
                int m2 = Integer.parseInt(o2[3]);
                if (m1 != m2) return m2 - m1;  // 수학 내림차순

                return o1[0].compareTo(o2[0]); // 이름 오름차순
            }
        });

        for (String[] s : student) {
            System.out.println(s[0]);
        }
    }
}
