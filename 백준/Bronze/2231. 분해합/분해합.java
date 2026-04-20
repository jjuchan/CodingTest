import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		for (int i = 1; i < N; i++) {
			int sum = i;
			int temp = i;

			while (temp > 0) {
				sum += temp % 10;
				temp /= 10;
			}
			if(sum == N) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(0);
	}
}
// 자연수 분해합 -> N의 분해합은 N과 N의 각 자리수의 합으로 이루어진 수
