package programmers.day4;

import java.util.*;
public class practice4 {
    public static void main(String[] args) {


    }

    public static int[] solution(int[] answers) {
        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int score1 = 0;
        int score2 = 0;
        int score3 = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == p1[i % p1.length]) {
                score1++;
            }
            if (answers[i] == p2[i % p2.length]) {
                score2++;
            }
            if (answers[i] == p3[i % p3.length]) {
                score3++;
            }
        }
        int maxscore = score1;
        if (score2 > maxscore) {
            maxscore = score2;
        }
        if (score3 > maxscore) {
            maxscore = score3;
        }
        ArrayList<Integer> list = new ArrayList<>();

        if (score1 == maxscore) {
            list.add(1);
        }
        if (score2 == maxscore) {
            list.add(2);
        }
        if (score3 == maxscore) {
            list.add(3);
        }

        // 리스트를 배열로 변환해서 반환
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
//answer 배열에는 문제의 정답지