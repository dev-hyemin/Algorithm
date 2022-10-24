class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];
        int num = num1*num2;
        int denum = denum1*num2 + denum2*num1;
        int min = 0;
        for (int i=2; i<=num; i++){
            if (denum%i == 0 && num%i == 0){
                min = i; // 기존에는 이 자리에 denum/min; num/min;을 작성했었는데 2, 4로 나눠지는 경우 2가 먼저 넣어지기 때문에 4로 나눠지는지 어려움, 최대공약수를 찾아야함
            }
        }
        answer[0] = denum/min;
        answer[1] = num/min;
        return answer;
    }
}
