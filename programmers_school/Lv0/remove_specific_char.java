class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        if (1<=my_string.length() && my_string.length()<=100){
            if(my_string.contains(letter)==true){
                answer = my_string.replaceAll(letter, "");
            }
        }
        return answer;
    }
}