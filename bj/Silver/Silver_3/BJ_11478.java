package bj.Silver.Silver_3;


import java.io.*;
import java.util.*;

public class BJ_11478 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < S.length(); i++) {
            for (int j = i + 1; j <= S.length(); j++) {
                set.add(S.substring(i, j));
            }
        }

        System.out.println(set.size());
    }
}

// 문자열 S가 주어지면 부분문자열의 갯수를 구하여라

