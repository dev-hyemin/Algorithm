class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        if (dot.length==2 && (-500<=dot[0] && dot[0]<=500) && (-500<=dot[1] && dot[1]<=500)){
            if (dot[0]>0 && dot[1]>0){
                answer = 1;
            } else if (dot[0]<0 && dot[1]>0){
                answer = 2;
            } else if (dot[0]<0 && dot[1]<0){
                answer = 3;
            } else if (dot[0]>0 && dot[1]<0){
                answer = 4;
            }
        }
        return answer;
    }
}