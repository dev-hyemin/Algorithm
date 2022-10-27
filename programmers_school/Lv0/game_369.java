class Solution {
    public int solution(int order) {
        int answer = 0;
        int i = 10;
        int clap = 0;
        if (1<=order && order<=1000000){
            while(order%i!=0){
                clap = order%i;
                if (clap%3==0) answer++;
                order /= i;
            }
        }
        return answer;
    }
}