class Solution {
    public int[] solution(int n) {
        int indx = n/2 + n%2;
        int[] answer = new int[indx];
        int cnt=0;
        for (int i=1; i<n+1; i++){
            if (i%2!=0){
                answer[cnt] = i;
                cnt++;
            }
        }
        return answer;
    }
}