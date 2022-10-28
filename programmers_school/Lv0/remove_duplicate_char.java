class Solution {
    public String solution(String my_string) {
        String answer = "";
        if (1<=my_string.length() && my_string.length()<=110){
            for(int i=0; i<my_string.length(); i++){
                if (answer.indexOf(my_string.charAt(i))==-1){
                    answer += my_string.charAt(i);
                }
            }
        }
        
        return answer;
    }
}