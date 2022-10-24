class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int cnt =0;
        int temp = 0;
        for (int i=1; i<sides.length; i++){
            if (sides[i-1]>sides[i]){
                temp = sides[i];
                sides[i] = sides[i-1];
                sides[i-1] = temp;
            }
        }
        if ((sides[0] + sides[1]) > sides[2]){
            answer = 1;
        } else {
            answer = 2;
        }
        
        return answer;
    }
}