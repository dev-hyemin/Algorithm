class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int cnt = 0;
        if (1<=num_list.length && num_list.length<=1000){
            for (int i=num_list.length-1; i+1>0; i--){
                if (0<=num_list[i] && num_list[i]<=1000){
                    answer[cnt] = num_list[i];
                    cnt++;
                }
            }
        }
        return answer;
    }
}