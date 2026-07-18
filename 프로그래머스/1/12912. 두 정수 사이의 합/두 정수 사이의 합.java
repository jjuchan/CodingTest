import java.util.Scanner;

class Solution {
    public static long solution(int a, int b) {
        long answer = 0;

        int start = Math.min(a, b);
        int end = Math.max(a, b);

        for (int i = start; i <= end; i++) {
            answer += i;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        long result = solution(A, B);
        System.out.println(result);
    }
}
