class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {0, 0};
        if (1<=num_list.length && num_list.length<=100){
            for(int i=0; i<num_list.length; i++){
                if (0<=num_list[i] && num_list[i]<=1000){
                    if (num_list[i]%2==0){
                        answer[0]++;
                    } else {
                        answer[1]++;
                    }
                }
            }
        }
        return answer;
    }
}