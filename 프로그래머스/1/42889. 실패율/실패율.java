import java.util.*;  

  public class Solution {
        public int[] solution(int N, int[] stages) {
            int[] result = new int[N];
            int totalPlayers = stages.length;

            // 실패율과 스테이지 번호 저장 리스트 (double[]로 표현)
            List<double[]> stageList = new ArrayList<>();

            // 1부터 N까지 스테이지별 실패율 계산
            for (int i = 1; i <= N; i++) {
                int failCount = 0;
                for (int s : stages) {
                    if (s == i) {
                        failCount++;
                    }
                }

                double failureRate = 0;
                if (totalPlayers > 0) {
                    failureRate = (double) failCount / totalPlayers;
                }

                stageList.add(new double[]{i, failureRate});

                totalPlayers -= failCount; // 다음 스테이지에 도달한 플레이어 수로 갱신
            }

            // 실패율 내림차순, 실패율 같으면 스테이지 번호 오름차순 정렬
            stageList.sort((a, b) -> {
                if (b[1] == a[1]) {
                    return Double.compare(a[0], b[0]);
                } else {
                    return Double.compare(b[1], a[1]);
                }
            });

            // 정렬된 스테이지 번호를 결과 배열에 담기
            for (int i = 0; i < N; i++) {
                result[i] = (int) stageList.get(i)[0];
            }

            return result;
        }
    }