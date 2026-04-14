import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int[] arr;
	static boolean[] visited;
	static StringBuilder stringBuilder = new StringBuilder();

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());

		stringBuilder = new StringBuilder();

		arr = new int[N];

		visited = new boolean[N + 1];

		dfs(0);

		System.out.println(stringBuilder);

	}

	static void dfs(int depth) {
		if (depth == N) {
			for (int i = 0; i < N; i++) {
				stringBuilder.append(arr[i]).append(" ");
			}
			stringBuilder.append("\n");
			return;
		}

		for (int i = 1; i <= N; i++) {
			if (!visited[i]) {
				visited[i] = true;
				arr[depth] = i;
				dfs(depth + 1);
				visited[i] = false;
			}
		}
	}
}
