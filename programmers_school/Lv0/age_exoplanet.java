class Solution {
    public String solution(int age) {
        String answer = "";
        String temp = Integer.toString(age);
        if (0<age && age<=1000){
            for (int i=0; i<temp.length(); i++){
                answer += (char)(temp.charAt(i)+49);
            }
        }
        return answer;
    }
}