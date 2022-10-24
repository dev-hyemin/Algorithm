class Solution {
    public int solution(int n) {
        int answer = 1;
        if (1<=n && n<=100){
            while(true){
                if ((6*answer)%n!=0) answer++;
                else break;
            }
        }
        return answer;
    }
}