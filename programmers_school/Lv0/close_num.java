class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int num = 0;
        int temp = n;
        for (int i: array){
            if (i<n) num = n-i;
            else num = i-n;
            if (temp>num){
                answer = i;
                temp = num;
            } else if (temp == num && i<answer) answer = i;
        }
        return answer;
    }
}