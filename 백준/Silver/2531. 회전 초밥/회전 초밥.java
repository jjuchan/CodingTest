

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int d = Integer.parseInt(stringTokenizer.nextToken());
        int k = Integer.parseInt(stringTokenizer.nextToken());
        int c = Integer.parseInt(stringTokenizer.nextToken());

        int[] Sushis = new int[N];

        for (int i = 0; i < Sushis.length; i++) {
            Sushis[i] = Integer.parseInt(br.readLine());
        }

        int[] count = new int[d + 1];
        int type = 0;

        // 초기 윈도우 설정 (수정됨)
        for (int i = 0; i < k; i++) {
            if (count[Sushis[i]] == 0) {
                type++;
            }
            count[Sushis[i]]++;
        }

        int max = type;
        // 쿠폰 초밥이 현재 윈도우에 없다면 추가
        if (count[c] == 0) {
            max++;
        }

        // 슬라이딩 윈도우
        for (int i = 1; i < N; i++) {
            // 제거되는 초밥
            int remove = Sushis[i - 1];
            count[remove]--;
            if (count[remove] == 0) {
                type--;
            }

            // 추가되는 초밥
            int input = Sushis[(i + k - 1) % N];
            if (count[input] == 0) { // Sushis[input] → count[input]
                type++;
            }
            count[input]++;

            // 현재 최댓값 계산
            int currentMax = type;
            if (count[c] == 0) {
                currentMax++;
            }

            max = Math.max(max, currentMax);
        }

        System.out.println(max);
    }
}

/**
 * 회전 초밥 벨트에 놓인 접시의 수 N, 초밥의 가짓 수 d, 연속해서 먹는 초밥 수 k, 쿠폰 번호 c
 */