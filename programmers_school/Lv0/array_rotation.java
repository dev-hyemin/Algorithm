class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        if (3<=numbers.length && numbers.length<=20){
            if (direction.equals("right")){
                for (int i=numbers.length-1; i>=0; i--){
                    if(i+1==numbers.length){
                        answer[0] = numbers[i];
                    } else {
                        answer[i+1] = numbers[i];
                    }
                }
            } else {
                for (int i=0; i<numbers.length; i++){
                    if (i-1==-1){
                        answer[numbers.length-1] = numbers[i];
                    } else {
                        answer[i-1] = numbers[i];
                    }
                }
            }
        }
        return answer;
    }
}