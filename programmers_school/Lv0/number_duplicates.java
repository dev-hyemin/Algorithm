class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        if ((1<=array.length && array.length<=100) && (0<=n && n<=1000)){
            for (int i=0; i<array.length; i++){
                if (0<=array[i] && array[i]<=1000){
                    if(array[i]==n){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}