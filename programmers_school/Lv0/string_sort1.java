import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        String s = my_string.replaceAll("[^0-9]","");
        int[] answer = new int[s.length()];
        if (1<=my_string.length() && my_string.length()<=100){
            for (int i=0; i<s.length(); i++){
                answer[i] = Character.getNumericValue(s.charAt(i));
            }
            Arrays.sort(answer);
        }
        return answer;
    }
}