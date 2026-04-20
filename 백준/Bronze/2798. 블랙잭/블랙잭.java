import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[] cards = new int[N + 1];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			cards[i] = Integer.parseInt(st.nextToken());
		}

		int max = 0;

		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				for(int k = j + 1; k < N; k++) {
					int sum = cards[i] + cards[j] + cards[k];
					if (sum <= M) {
						max = Math.max(max, sum);
					}
				}
			}
		}

		System.out.println(max);
	}
}

// 카드 합이 21을 넘지 않고 합을 가장 크게 만들기
// N 은 카드의 갯수 M은 최대한 가깝게 만들어야 하는 수