package bj.Silver.Silver_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class BJ_12891 {
    static int[] myArr;
    static int[] checkArr;
    static int checkSecret;
    public static void main(String[] args) throws IOException {
        //{`A`,`C`,`G`,`T`} DNA 문자열 슬라이딩 윈도우 방식을 사용
        // A,C,G는 1개 이상 T는 0개도 가능
        // 1. 임의로 만든 문자열의 길이 S 와 사용할 부분 문자열 P
        // 2. 임의로 만든 비밀번호
        // 부분문자열 P에 포함되어야 할 4개의 문자의 최소 개수가 공백을 구분하여 제공 각각의 수는 S보다 작거나 같은 수

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken()); // S와 P
        int P = Integer.parseInt(st.nextToken());
        int Result = 0;
        checkArr = new int[4]; //주어진 조건
        myArr = new int[4]; // 현재 주어진 문자열에서 A C G T 의 갯수 현황
        char[] A = new char[S]; // 전체 문자열
        checkSecret = 0; // 4개의 문자열 중에 부분 문자열에 몇개가 만족하는지 즉 이게 4가 되면 result++

        A = br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());// 숫자의 조건을 담는 부분
        for (int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
            if (checkArr[i] == 0) { // 포함 하지 않아도 되는 문자열이 있다는 것은 만족했다고 보면 됨
                checkSecret++;
            }
        }
        for (int i = 0; i < P; i++) { //부분 문자열을 처음 받을 때는 윈도우 크기까지
            Add(A[i]);
        }
        if (checkSecret == 4) Result++;

        for (int i = P; i < S; i++) { //슬라이딩 윈도우 끝 인덱스
            int j = i - P; //시작 인덱스도 한칸씩 이동이 되는 구조
            Add(A[i]);
            Remove(A[j]);
            if (checkSecret == 4) Result++;
        }
        System.out.println(Result);

    }

    private static void Remove(char c) {
        switch (c) {
            case 'A':
                if(myArr[0] == checkArr[0]) checkSecret--;
                myArr[0]--;
                break;
            case 'C':
                if(myArr[1] == checkArr[1]) checkSecret--;
                myArr[1]--;
                break;
            case 'G':
                if(myArr[2] == checkArr[2]) checkSecret--;
                myArr[2]--;
                break;
            case 'T':
                if(myArr[3] == checkArr[3]) checkSecret--;
                myArr[3]--;
                break;
        }
    }

    private static void Add(char c) {
        switch (c) {
            case 'A':
                myArr[0]++;
                if(myArr[0] == checkArr[0]) checkSecret++;
                break;
            case 'C':
                myArr[1]++;
                if(myArr[1] == checkArr[1]) checkSecret++;
                break;
            case 'G':
                myArr[2]++;
                if(myArr[2] == checkArr[2]) checkSecret++;
                break;
            case 'T':
                myArr[3]++;
                if(myArr[3] == checkArr[3]) checkSecret++;
                break;
        }
    }
}
