class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        if (2<=numbers.length && numbers.length<=100){
            for (int i=0; i<numbers.length; i++){
                if (0<=numbers[i] && numbers[i]<=10000){
                    for (int j=0; j<numbers.length; j++){
                        if (i!=j){
                            if (answer<numbers[i]*numbers[j]){
                                answer = numbers[i]*numbers[j];
                            }
                        }
                    }
                }
            }
        }
        return answer;
    }
}