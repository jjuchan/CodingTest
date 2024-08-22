package backjon;

import java.io.*;

public class test11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i <= n; i++) {
            String s = br.readLine();
            int a = Integer.parseInt(s.split(" ")[0]);
            int b = Integer.parseInt(s.split(" ")[1]);

            bw.write("Case #"+i+": "+ (a+b) + "\n"); //괄호를 넣어서 덧셈을 계산
        }
        bw.flush();

    }
}
