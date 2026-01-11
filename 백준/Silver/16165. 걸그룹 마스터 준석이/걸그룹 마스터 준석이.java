import java.util.*;
import java.io.*;

public class Main {
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