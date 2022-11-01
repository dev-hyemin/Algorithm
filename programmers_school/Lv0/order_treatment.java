class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int cnt = 0;
        for (int i=0; i<emergency.length; i++){
            cnt = 0;
            for (int j: emergency) if (emergency[i]<=j) cnt++;
            answer[i] = cnt;
        }
        return answer;
    }
}