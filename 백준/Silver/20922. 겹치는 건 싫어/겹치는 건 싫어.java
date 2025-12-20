
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int K = Integer.parseInt(stringTokenizer.nextToken());

        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Map<Integer, Integer> count = new HashMap<>();
        int start = 0;
        int end = 0;
        for (int i = 0; i < N; i++) {
            count.put(arr[i], count.getOrDefault(arr[i], 0) + 1);

            while (count.get(arr[i]) > K) {
                count.put(arr[start], count.get(arr[start]) - 1);
                start++;
            }
            end = Math.max(end, i - start + 1);
        }
        System.out.println(end);
    }
}