class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = 0;
        while(cnt<n){
            answer++;
            cnt++;
            while(true){
                if (answer%3==0) answer++;
                else if (Integer.toString(answer).contains("3")) answer++;
                else break;
            }
        }
        return answer;
    }
}