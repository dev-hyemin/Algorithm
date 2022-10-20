class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int sum = 0;
        if (1<=numbers.length && numbers.length<=100){
            for(int i=0;i<numbers.length;i++){
                if (0<=numbers[i] && numbers[i]<=1000){
                    sum = sum + numbers[i];
                }
            }
        }
        answer = sum/(double)numbers.length;
        return answer;
    }
}