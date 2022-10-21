class Solution {
    public String solution(String my_string) {
        String answer = "";
        if (1<=my_string.length() && my_string.length()<=1000){
            StringBuffer sb = new StringBuffer(my_string);
            answer = sb.reverse().toString();
        }
        return answer;
    }
}