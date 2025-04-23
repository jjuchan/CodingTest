package backjon;

import java.util.Scanner;

public class test1541 {
    static int answer =0;
    public static void main(String[] args) {
        // 0~9 와 + -만 사용
        // 최소를 만들려면 가장 작은 값에서 가장 큰값을 빼야함

        Scanner sc = new Scanner(System.in);
        String example =sc.nextLine();
        String[] str = example.split("-"); // 먼저 -를 기준으로 문자열을 분리
        for (int i = 0; i < str.length; i++) {
            int temp = mysum(str[i]);
            if (i == 0) {
                answer = answer + temp;
            } else {
                answer = answer - temp;
            }
        }
        System.out.println(answer);
    }

    private static int mysum(String a) {// 분리한 문자열의 덧셈을 계산해주는 함수
        int sum = 0;
        String[] temp = a.split("[+]"); // +를 잘 인식 못해서 []를 넣어줌
        for (int i = 0; i < temp.length; i++) {
            sum += Integer.parseInt(temp[i]);
        }
        return sum;
    }
}
