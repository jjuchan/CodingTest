package programmers.days.day4;

import java.util.*;
public class practice2 {
    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
        System.out.println(solution(citations));
    }
        public static int solution(int[] citations) {
            Arrays.sort(citations);  // 인용 횟수를 오름차순으로 정렬
            int n = citations.length;

            for (int i = 0; i < n; i++) {
                int h = n - i;  // 현재 논문보다 인용 횟수가 많거나 같은 논문의 수
                if (citations[i] >= h) {
                    return h;   // 조건을 만족하는 h값 중 가장 큰 값을 바로 리턴
                }
            }

            return 0;  // 모든 조건을 만족하는 h가 없으면 0 반환
        }
}
