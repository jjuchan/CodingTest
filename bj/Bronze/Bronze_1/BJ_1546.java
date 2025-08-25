package bj.Bronze.Bronze_1;

import java.util.Scanner;

public class BJ_1546 {
    public static void main(String[] args) {
        /* 1번째 풀이
        Scanner sc = new Scanner(System.in);
        int subjects = sc.nextInt();
        int arr[] = new int[subjects];

        int max = 0;
        for (int i = 0; i < subjects; i++) { //높은 점수 구하기
            arr[i]= sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        double sum = 0; //소수점으로 나와야하니 형 변환
        for (int i = 0; i < subjects; i++) {
            sum += (double) arr[i] / max * 100;
        }
        double ave = sum / subjects;
        System.out.println(ave);

        sc.close();
        */

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i =0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        long sum = 0;
        long max = 0;

        for(int i =0; i<arr.length;i++){
            if(arr[i]>max) max = arr[i];
            sum += arr[i];
        }
        System.out.println(sum*100.0/max/N);
        }
    }

