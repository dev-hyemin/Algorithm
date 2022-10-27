class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String temp = "";
        if (1<=array.length && array.length<=100){
            for (int i=0; i<array.length; i++){
                if (0<=array[i] && array[i]<=100000){
                    temp = Integer.toString(array[i]);
                    answer += temp.chars().filter(c->c=='7').count();
                    
                }
            }
        }
        return answer;
    }
}