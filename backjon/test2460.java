package backjon;

import java.util.Scanner;

public class test2460 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxPassengers = 0; // 기차 안에서 가장 많은 인원 수를 저장할 변수
        int currentPassengers = 0; // 현재 기차 안의 인원 수

        for (int i = 1; i <= 10; i++) {
            int out = sc.nextInt(); // 내린 사람 수
            int in = sc.nextInt();  // 탄 사람 수

            // 현재 역에서 내린 사람들을 빼고, 탄 사람들을 더함
            currentPassengers = currentPassengers - out + in;

            // 최대 인원 수 갱신
            if (currentPassengers > maxPassengers) {
                maxPassengers = currentPassengers;
            }
        }

        sc.close();

        // 결과 출력: 기차 안에서 사람이 가장 많을 때의 인원 수
        System.out.println(maxPassengers);
    }
}
