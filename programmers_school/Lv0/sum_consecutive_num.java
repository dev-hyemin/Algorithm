class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int first = (2*total/num + 1 - num) / 2;
        for(int i=0; i<num; i++){
            answer[i] = first;
            first++;
        }
        return answer;
    }
}