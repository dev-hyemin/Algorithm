class Solution {
    public int solution(int n) {
        int answer = 0;
        if (0<=n && n<=1000000){
            while(n>0){
                answer += n%10;
                n /= 10;
            }
            answer += n;
        }
        return answer;
    }
}