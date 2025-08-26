package programmers.days.day4;

import java.util.Arrays;

import java.util.*;
import java.io.*;
public class practice1 {
    public static void main(String[] args) {
        int[] number = {6, 10, 2};
        System.out.println(solution(number));


    }

    public static String solution(int[] numbers) {

        String[] line = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            line[i] = String.valueOf(numbers[i]); //받아온 배열의 수를 문자열로 바꾸어 저장
        }
        Arrays.sort(line, (a, b) -> (b + a).compareTo(a + b)); //b + a면 큰 수가 앞에

        if (line[0].equals("0")) return "0";

        StringBuilder sb = new StringBuilder();
        for (String a : line) {
            sb.append(a);
        }
        String answer = sb.toString();
        return answer;
    }
}
