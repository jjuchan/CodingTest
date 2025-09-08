package programmers.test2;

class PG_178870 {
    public int[] solution(int[] sequence, int k) {

        int start = 0;
        int end = 0;
        int sum = 0;

        int[] answer = {0, sequence.length - 1};

        while (end < sequence.length) {
            sum += sequence[end];

            while (sum > k) {
                sum -= sequence[start];
                start++;
            }
            if (sum == k) {
                if((end - start) < (answer[1] - answer[0])){
                    answer[0] = start;
                    answer[1] = end;
                }
            }
            end++;
        }
        return answer;
    }
}
// 비내림차순으로 정렬된 배열 sequence와 정수 k가 주어질 때,
// 기존 수열에서 연속된 부분 수열을 추출하여 그 합이 k가 되는
// 가장 짧은 부분 수열의 시작 인덱스와 끝 인덱스를
// 길이가 2인 정수 배열에 담아 return 하도록 solution 메서드를 완성해주세요.
