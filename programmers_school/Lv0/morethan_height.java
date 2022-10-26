class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        if ((1<=array.length && array.length<=100) && (1<=height && height<=200)){
            for(int i=0;i<array.length;i++){
                if(1<=array[i] && array[i]<=200){
                    if(array[i]>height){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}