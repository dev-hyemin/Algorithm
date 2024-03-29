class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[my_str.length()%n==0?my_str.length()/n:my_str.length()/n+1];
        for (int i=0; i<answer.length; i++){
            if (i*n+n>my_str.length()) answer[i] = my_str.substring(i*n, my_str.length());
            else answer[i] = my_str.substring(i*n,i*n+n);
        }
        return answer;
    }
}