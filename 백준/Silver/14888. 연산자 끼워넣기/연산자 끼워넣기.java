

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int N; // 입력 수의 갯수
	static int num[]; // 수 입력
	static int oper[] = new int[4]; // 연산자 넣기
	static int MAX = Integer.MIN_VALUE; // 최댓값
	static int MIN = Integer.MAX_VALUE; // 최솟값

	public static void main(String[] args) throws IOException { // N은 수의 갯수, + - * / 순으로 연산자를 끼워넣기, 최대인 값과 최소인 값 구하기
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine()); // 입력할 수의 갯수
		num = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			num[i] = Integer.parseInt(st.nextToken()); // 수를 배열에 입력
		}

		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < 4; i++) {
			oper[i] = Integer.parseInt(st.nextToken()); // 연산자를 배열에 입력
		}

		Bactracking(num[0], 1);
		System.out.println(MAX);
		System.out.println(MIN);

	}

	private static void Bactracking(int now, int index) {
		// TODO Auto-generated method stub
		if (index == N) {
			MAX = Math.max(MAX, now);
			MIN = Math.min(MIN, now);
			return;
		}
		// +선택시
		if (oper[0] > 0) {
			oper[0]--;
			Bactracking(now + num[index], index + 1);
			oper[0]++;
		} // -선택시
		if (oper[1] > 0) {
			oper[1]--;
			Bactracking(now - num[index], index + 1);
			oper[1]++;
		} // x선택시
		if (oper[2] > 0) {
			oper[2]--;
			Bactracking(now * num[index], index + 1);
			oper[2]++;
		} // %선택시
		if (oper[3] > 0) {
			oper[3]--;
			Bactracking(now / num[index], index + 1);
			oper[3]++;
		}

	}

}
