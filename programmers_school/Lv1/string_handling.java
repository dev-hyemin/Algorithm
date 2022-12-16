class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if ((s.length() != 4) && (s.length() != 6)) answer = false;
        if (answer == true){
            s = s.replaceAll("[0-9]","");
            if (s.length()!=0) answer = false;
        }
        return answer;
    }
}