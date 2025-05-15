package backjon;

import java.util.*;
import java.io.*;

public class test16165 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 걸그룹 수
        int M = Integer.parseInt(st.nextToken()); // 퀴즈 수

        Map<String, List<String>> groupToMembers = new HashMap<>();
        Map<String, String> memberToGroup = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String groupName = br.readLine();
            int memberCount = Integer.parseInt(br.readLine());

            List<String> members = new ArrayList<>();
            for (int j = 0; j < memberCount; j++) {
                String memberName = br.readLine();
                members.add(memberName);
                memberToGroup.put(memberName, groupName); // 멤버 → 그룹 저장
            }

            // 사전 순 정렬 (문제에서 요구할 수 있음)
            Collections.sort(members);
            groupToMembers.put(groupName, members); // 그룹 → 멤버 저장
        }

        for (int i = 0; i < M; i++) {
            String quiz = br.readLine();
            int type = Integer.parseInt(br.readLine());

            if (type == 0) {
                // 그룹이름이 주어지면 그 멤버들을 출력
                List<String> members = groupToMembers.get(quiz);
                for (String member : members) {
                    System.out.println(member);
                }
            } else {
                // 멤버이름이 주어지면 그 멤버가 속한 그룹 출력
                System.out.println(memberToGroup.get(quiz));
            }
        }
    }
}


// 걸그룹 개인 이름과 팀 이름을 매칭하여 검색
// 입력 1. 입력 받을 걸그룹의 수 N 퀴즈 M
// 입력 2. 팀의 이름 인원 수 멤버 이름이 주어지고 이름이 같은 멤버는 없음
// 입력 3. M 개의 퀴즈 팀의 이름이나 멤버의 이름이 첫 줄에 주어지고 퀴즈의 종류를 나타내는 0 또는 1이
// 다음 줄에 주어지고 0이 나오면 멤버 이름을 사전 순으로 정렬하여 출력 주어지고 1은 그룸이름을 출력

// 그룹이름과 멤버 수를 맵에 저장하고 그에 맞게 멤버 이름은 리스트에 저장한다.