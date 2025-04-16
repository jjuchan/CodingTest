package backjon;

import java.util.Scanner;
import java.util.Stack;

public class test1874 {
    public static void main(String[] args) {
        // 스택 문제: 주어진 수열을 스택의 push(+), pop(-) 연산으로 만들 수 있는지 판단
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 수열의 갯수 (1부터 N까지)
        int[] A = new int[N]; // 목표 수열을 저장할 배열
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt(); // 수열 입력받기
        }

        Stack<Integer> stack = new Stack<>(); // 스택 선언
        int num = 1; // 오름차순으로 1부터 시작해서 스택에 넣을 숫자
        boolean result = true; // 수열을 만들 수 있으면 true, 아니면 false
        StringBuffer bf = new StringBuffer(); // 출력 결과 저장 (성능 위해 StringBuffer 사용)

        for (int i = 0; i < A.length; i++) {
            int num1 = A[i]; // 수열의 현재 목표 숫자

            // 현재 숫자(num)가 수열의 숫자(num1)보다 작거나 같을 때
            if (num1 >= num) {
                // num1까지 숫자를 스택에 push하면서 기록
                while (num1 >= num) {
                    stack.push(num++);
                    bf.append("+\n"); // push 했음을 기록
                }
                // 목표 숫자와 같아졌다면 pop하고 기록
                stack.pop();
                bf.append("-\n");
            } else {
                // 이미 스택에 들어간 숫자 중에서 꺼내야 함
                int num2 = stack.pop(); // top 값을 꺼냄
                // 만약 pop한 숫자가 목표 숫자보다 크면 스택 규칙상 만들 수 없는 수열
                if (num2 > num1) {
                    System.out.println("NO"); // 실패 출력
                    result = false;
                    break;
                } else {
                    // num2 == num1이면 pop만 하고 넘어감
                    bf.append("-\n");
                }
            }
        }

        // 수열 생성이 가능했다면 결과 출력
        if (result) System.out.println(bf.toString());
    }
}
