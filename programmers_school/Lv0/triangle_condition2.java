class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = sides[0]>sides[1]?sides[0]:sides[1];
        int min = Math.abs(sides[0]-sides[1]);
        int temp = max;
        while(true){
            temp++;
            if(temp < sides[0]+sides[1]) answer++;
            else break;
        }
        while(true){
            min++;
            if(max >= min) answer++;
            else break;
        }
        return answer;
    }
}