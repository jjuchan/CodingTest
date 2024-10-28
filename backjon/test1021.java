package backjon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class test1021 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        LinkedList<Integer> queue = new LinkedList<>();//입력 받을 큐 배열

        int[] getArr; //뽑아서 담아둘 배열

        int N = Integer.parseInt(st.nextToken()); // 큐의 크기
        int M = Integer.parseInt(st.nextToken()); // 뽑는 갯수
        int count = 0;

        for (int i = 1; i <= N; i++) {
            queue.offer(i); // 큐에 저장
        }
        st = new StringTokenizer(br.readLine());
        getArr = new int[M];
        for (int i = 0; i < M; i++) {
            getArr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < M; i++) {
            int target = queue.indexOf(getArr[i]); // 뽑으려는 인덱스
            int middle; // 중간 인덱스
            if (queue.size() % 2 == 0) { // 짝수면 -1 4면 2가 아니라 1의 인덱스값을 가져와야하니가
                middle = queue.size() / 2 - 1;
            } else {
                middle = queue.size() / 2;
            }
            if (target <= middle) {//타켓이 중간보다 앞에 있을때 2번 연산
                for (int j = 0; j < target; j++) {
                    int temp = queue.pollFirst(); //앞에 숫자 추출
                    queue.offerLast(temp); // 뒤에 담기
                    count++;
                }

            } else {
                for (int j = 0; j < queue.size() - target; j++) {
                    int temp = queue.pollLast(); //뒤에서 추출
                    queue.offerFirst(temp); // 앞에 담기
                    count++;
                }
            }
            queue.pollFirst(); //1번 연산
        }
        System.out.println(count);
    }

}



