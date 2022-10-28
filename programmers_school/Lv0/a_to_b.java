class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        int before_sum = 0;
        int after_sum = 0;
        for (int i=0; i<before.length(); i++){
            before_sum += before.charAt(i);
            after_sum += after.charAt(i);
        }
        if (before_sum == after_sum){
            answer = 1;
        }
        return answer;
    }
}