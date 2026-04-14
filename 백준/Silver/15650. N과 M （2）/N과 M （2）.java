import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int N, M;
	static int[] arr;
	static boolean[] visited;
	static StringBuilder stringBuilder = new StringBuilder();

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		stringBuilder = new StringBuilder();

		arr = new int[M];

		visited = new boolean[N + 1];

		dfs(0, 1);

		System.out.println(stringBuilder);

	}

	static void dfs(int depth, int start) {
		if (depth == M) {
			for (int i = 0; i < M; i++) {
				stringBuilder.append(arr[i]).append(" ");
			}
			stringBuilder.append("\n");
			return;
		}

		for (int i = start; i <= N; i++) {
			if (!visited[i]) {
				visited[i] = true;
				arr[depth] = i;
				dfs(depth + 1, i + 1);
				visited[i] = false;
			}
		}
	}
}
