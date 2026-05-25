		class Solution {
			public String solution(String str1, String str2) {
				char[] arr1 = str1.toCharArray();
				char[] arr2 = str2.toCharArray();

				StringBuilder sb = new StringBuilder();

				for (int i = 0; i < arr1.length; i++) {
					sb.append(arr1[i]);
					sb.append(arr2[i]);
				}

				return sb.toString();
			}
		}