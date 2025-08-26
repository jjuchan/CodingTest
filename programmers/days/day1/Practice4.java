package programmers.days.day1;

public class Practice4 {
    public static void main(String[] args) {

    }
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder stringBuilder = new StringBuilder(my_string);

        for (int i = 0; i < overwrite_string.length(); i++) {
            stringBuilder.setCharAt(s + i,overwrite_string.charAt(i));
        }
        return stringBuilder.toString();
    }
}
