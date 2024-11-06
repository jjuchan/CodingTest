package backjon;

import java.util.Arrays;
import java.util.Scanner;

public class test10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();

        int arr[] = new int[26];
        Arrays.fill(arr, -1); // -1 로 배열 초기화
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if(arr[c-'a'] == -1){
                arr[c-'a'] = i; //-1이면 그 인덱스 값으로 바꿈
            }
        }
        for (int i = 0; i < 26; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
