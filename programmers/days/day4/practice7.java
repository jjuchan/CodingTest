package programmers.days.day4;

class practice7 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];  // 최종 지도 문자열 배열

        for (int i = 0; i < n; i++) {
            int orResult = arr1[i] | arr2[i];

            String binaryString = String.format("%" + n + "s", Integer.toBinaryString(orResult));
            // 예) orResult=9, n=5 -> " 1001" (앞에 공백 1개, 총 5자리)

            binaryString = binaryString.replace('0', ' ').replace('1', '#');

            answer[i] = binaryString;
        }

        return answer;
    }
}
// n은 지도 크기 , arr1 첫번째 지도 십진수 , arr2은 두번째, 두 지도에 하나라도 1이면 걍 1, 두 지도 다 0이면 0
