package backjon;

import java.util.Scanner;

public class test2884 { //입력한 시간의 45분 빠른 시간을 출력하는 문제
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        if(M<45) { // 분이 45분보다 작을 때
            H--; // 시간은 하나 내려주고
            M = 60 - (45 - M); // 45분에서 입력한 분을 뺀 다음 1시간에서 빼주면 나온다.
            if(H<0) {// -1이라는 시간은 없기 때문에 23으로 변환
                H = 23;
        } System.out.println(H+" "+M);
        } else {
        System.out.println(H+" "+(M-45));
        }
        sc.close();
    }
}
