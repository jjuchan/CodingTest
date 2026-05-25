	class Solution {
			public int solution(int a, int b) {

				String k = Integer.toString(a) +  Integer.toString(b);

				String k2 = Integer.toString(a * b * 2);
				
				int answer = Math.max(Integer.parseInt(k), Integer.parseInt(k2));

				return answer;
			}
		}