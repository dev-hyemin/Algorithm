class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        int[] temp = new int[score.length];
        for (int i=0; i<score.length; i++){
            temp[i] = (score[i][0] + score[i][1])/2 + (score[i][0] + score[i][1])%2; // 나누기만 하는 경우 [[1, 2], [1, 1], [1, 1]] 로 들어올때 [1, 1, 1]로 출력되므로 나머지를 더하도록
        }
        for (int i=0; i<temp.length; i++){
            for (int j=0; j<temp.length; j++){
                if (temp[i]<temp[j]) answer[i]++;
            }
            answer[i]++;
        }
        return answer;
    }
}