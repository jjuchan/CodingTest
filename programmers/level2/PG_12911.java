package programmers.level2;

public class PG_12911 {
    public static void main(String[] args) {

    }

    class Solution {
        public int solution(int n) {

            int countOfOnes = Integer.toBinaryString(n).replace("0", "").length();

            while (true) {
                n++;

                int nextCountOfOnes = Integer.toBinaryString(n).replace("0", "").length();

                if (countOfOnes == nextCountOfOnes) {
                    return n;
                }
            }
        }
    }

}

/**
 * 1. n의 다음 큰 숫자는 n보다 큰 자연수입니다.
 * 2. n의 다음 큰 숫자와 n은 2진수로 변환 했을 때 1의 갯수가 같다.
 * 3. n의 다음 큰 숫자는 조건 1,2를 만족하는 수 중 가장 작은 수 입니다.
 */
