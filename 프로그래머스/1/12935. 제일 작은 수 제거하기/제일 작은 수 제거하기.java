import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length < 2) {
            return new int[] {-1};
        }

        int[] arr2 = arr.clone();
        Arrays.sort(arr2);
        int min = arr2[0];

        int[] result = new int[arr.length - 1];
        int idx = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                continue;
            }
            result[idx++] = arr[i];
        }

        return result;
    }
}