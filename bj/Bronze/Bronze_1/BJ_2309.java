package bj.Bronze.Bronze_1;

import java.util.Arrays;
import java.util.Scanner;

public class BJ_2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];

        int sum = 0; //100을 만들기 위한 합 변수 생성

        for (int i = 0; i < 9; i++) {

            int n = sc.nextInt(); // 난쟁이 키 입력

            arr[i] = n;

            sum += arr[i];

        }
        Arrays.sort(arr);
        int a = 0, b = 0; //다른 난쟁이를 찾기 위한 변수 생성, 총합에서 두개의 키를 뺏을 때 100이 되면 그 두명이 거짓 난쟁이
        sc.close();

        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) { //두번째부터 시작해야함
                if (sum - arr[i] - arr[j] == 100) {
                    a = i; //인덱스 값 추출
                    b = j;
                    break;
                }

            }

        }

        for (int i = 0; i < arr.length; i++) {
            if (i != a && i != b) {
                System.out.println(arr[i]);
            }
        }
    }
}
