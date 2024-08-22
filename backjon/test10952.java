package backjon;

import java.io.*;

public class test10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String s = br.readLine();
            int a = Integer.parseInt(s.split(" ")[0]);
            int b = Integer.parseInt(s.split(" ")[1]);

        if (a == 0 && b == 0) { //둘 다 0일때 빠져나오기
            break;

        } bw.write((a +b) +"\n");

        }   bw.flush();
    }
}
