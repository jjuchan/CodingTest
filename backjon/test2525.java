package backjon;

import java.util.Scanner;

public class test2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 현재 시각
        int H = sc.nextInt(); // 현재 시간 (0~23)
        int M = sc.nextInt(); // 현재 분 (0~59)

        // 소요 시간 (분 단위)
        int T = sc.nextInt();

        // 총 시간을 더해주는 로직
        M += T; // 현재 분에 소요 시간 더하기

        // 시간을 분리해서 처리
        H += M / 60; // 60분을 초과하면 그 값을 시간으로 올리기
        M = M % 60; // 남은 분을 계산

        // 24시간 체제이므로 24시간을 초과하면 다시 0시로 돌아가게 한다.
        H = H % 24;

        // 결과 출력
        System.out.println(H + " " + M);
    }
}
