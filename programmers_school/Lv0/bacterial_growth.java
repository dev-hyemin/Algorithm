class Solution {
    public int solution(int n, int t) {
        int answer = 0;
        if ((1<=n && n<=10) && (1<=t && t<=15)){
            while(t>0){
                n *=2;
                t--;
            }
            answer = n;
        }
        return answer;
    }
}