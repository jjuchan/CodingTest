package backjon;

import java.io.*;
import java.util.*;

public class test13414 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        LinkedHashSet<String> set = new LinkedHashSet<>();

        for (int i = 0; i < L; i++) {
            String number = br.readLine();
            if (set.contains(number)) {
                set.remove(number);  // 기존 거 삭제
            }
            set.add(number);          // 항상 맨 뒤에 추가됨
        }

        int count = 0;
        for (String s : set) {
            if (count == K) break;
            System.out.println(s);
            count++;
        }
    }
}


//수강신청 버튼을 누르면 대기 목록에 들어감 근데 이미 들어가 있는데 누르면 맨 뒤로 밀려남, 앞부터 자동 수강 신청
// 입력 1. 수강 가능한 인원수 K , 대기 목록 크기 L
// 입력 2. L 만큼의 학생들 학번
// 출력 1. 조건에 맞게 확인 후 수강 신청 된 학번 출력