class Solution {
    public int solution(int n) {
        int answer = 0;
        if (0<n && n<=1000){
            while(n>0){
                for(;n>0;n--){
                    if (n%2==0){
                        answer += n;
                    }
                }
            }
        }
        return answer;
    }
}