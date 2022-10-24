class Solution {
    public String solution(String rsp) {
        String answer = "";
        if (0<rsp.length() && rsp.length()<=100){
            for (int i=0; i<rsp.length(); i++){
                if (rsp.charAt(i)=='0') answer+='5';
                else if (rsp.charAt(i)=='2') answer+='0';
                else answer+='2';
            }
        }
        return answer;
    }
}