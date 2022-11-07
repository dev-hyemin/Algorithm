class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int temp = 0;
        while(chicken/10>0){
            answer += chicken/10;
            temp = chicken;
            chicken /= 10;
            chicken += temp%10;
        }
        return answer;
    }
}