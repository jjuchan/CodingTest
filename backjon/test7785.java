package backjon;


import java.io.*;
import java.util.*;

public class test7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> map = new HashSet<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String now = st.nextToken();
            if (now.equals("enter")) {
                map.add(name);
            } else if (now.equals("leave")) {
                map.remove(name);
            }
        }
        ArrayList<String> list = new ArrayList<>(map);
        list.sort(Collections.reverseOrder());

        for (String name : list) {
            System.out.println(name);
        }
    }
}
//입력 .1 출입 기록 수  n
//입력 .2 출입 기록이 순서대로 주어지고 들어오면 enter, 나가면 leave, 사람 이름은 알파벳 대소문자로 구성된 5글자 이하의 문자열
//출력 1. 들어와있는 사람을 사전 역순으로