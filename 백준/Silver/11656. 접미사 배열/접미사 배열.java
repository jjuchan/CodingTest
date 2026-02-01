import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();

        List<String> result = new ArrayList<>();

        for (int i = 0; i < S.length(); i++) {
            result.add(S.substring(i));
        }
        Collections.sort(result);
        for (String line : result) {
            System.out.println(line);
        }
    }
}