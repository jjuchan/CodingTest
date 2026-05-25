class Solution {
			public int solution(int a, int b) {

				String max1 = Integer.toString(a) + Integer.toString(b);
				String max2 = Integer.toString(b) + Integer.toString(a);

				int answer = Math.max(Integer.parseInt(max1), Integer.parseInt(max2));
				return answer;
			}
		}