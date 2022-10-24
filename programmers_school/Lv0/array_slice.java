class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[indx(num1, num2)];
        int cnt = 0;
        
        if (0<numbers.length && numbers.length<=100){
            for (int i=num1; i<=num2; i++){
                if (0<=numbers[i] && numbers[i]<=1000){
                    answer[cnt] = numbers[i];
                    cnt++;
                }
            }
        }
        
        return answer;
    }
    public static int indx(int num1, int num2){
        int indx = 0;
        indx = num2-num1+1;
        return indx;
    }
}