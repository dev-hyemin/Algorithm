class Solution {
    public int solution(int[] numbers) {
        int answer = numbers[0]*numbers[1];
        if (2<=numbers.length && numbers.length<=100){
            for (int i=0; i<numbers.length; i++){
                for (int j=0; j<numbers.length; j++){
                    if (i!=j){
                        if (answer<numbers[i]*numbers[j]) answer = numbers[i]*numbers[j];
                    }
                }
            }
        }
        return answer;
    }
}