 class Solution {
        public int[] solution(String s) {

            int count = 0;
            int remove = 0;
            while (!s.equals("1")) {
                int start = s.length();
                s = s.replace("0", "");
                int end = s.length();

                remove += (start - end);
                s = Integer.toBinaryString(end);
                count++;
            }

            int[] answer = {count, remove};
            return answer;

        }
    }