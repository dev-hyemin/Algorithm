class Solution {
    public String solution(String phone_number) {
        String answer = "";
        answer = phone_number.replaceAll("[0-9]","*");
        return answer;
    }
}