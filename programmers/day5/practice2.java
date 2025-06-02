package programmers.day5;

import java.util.Arrays;

public class practice2 {
    public static void main(String[] args) {


    }

    class Solution {
        public boolean solution(String[] phone_book) {
            Arrays.sort(phone_book); // 문자열 정렬: 사전 순

            for (int i = 0; i < phone_book.length - 1; i++) {
                if (phone_book[i + 1].startsWith(phone_book[i])) {
                    return false;
                }
            }

            return true;
        }
    }
}
