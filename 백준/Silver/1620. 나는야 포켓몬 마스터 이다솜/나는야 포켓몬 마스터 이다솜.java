

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 도감에 등록된 포켓몬 수
        int M = Integer.parseInt(st.nextToken()); // 문제의 수

        // 번호 -> 이름 맵
        HashMap<Integer, String> numberToName = new HashMap<>();
        // 이름 -> 번호 맵
        HashMap<String, Integer> nameToNumber = new HashMap<>();

        // 포켓몬 도감 채우기
        for (int i = 1; i <= N; i++) {  // 번호는 1부터 시작
            String name = br.readLine();
            numberToName.put(i, name);  // 번호 -> 이름
            nameToNumber.put(name, i);  // 이름 -> 번호
        }

        // 문제 처리
        for (int i = 0; i < M; i++) {
            String query = br.readLine().trim();  // 입력 받는 값

            // 숫자(번호)인지 문자열(이름)인지 확인
            if (query.matches("[0-9]+")) {  // 숫자(번호)일 경우
                int number = Integer.parseInt(query);  // 문자열을 숫자로 변환
                System.out.println(numberToName.get(number));  // 번호로 이름 출력
            } else {  // 문자열(이름)일 경우
                System.out.println(nameToNumber.get(query));  // 이름으로 번호 출력
            }
        }
    }
}
