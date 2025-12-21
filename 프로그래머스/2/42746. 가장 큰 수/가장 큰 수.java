import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] line = new String[numbers.length];
        
        for(int i = 0; i < numbers.length; i++){
            line[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(line , (a,b) -> (b + a).compareTo(a+b));
        
        if(line[0].equals("0")) return "0";
        
        StringBuilder sb = new StringBuilder();
        
        for(String a : line){
            sb.append(a);
        }
        
        String answer = sb.toString();
        return answer;
    }
}