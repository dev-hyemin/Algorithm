class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int max1 = 0;
        int max2 = 0;
        for (int i=1; i<dots.length; i++){
            if (max1 < Math.abs(dots[i-1][0]-dots[i][0])) max1 = Math.abs(dots[i-1][0]-dots[i][0]);
            if (max2 < Math.abs(dots[i-1][1]-dots[i][1])) max2 = Math.abs(dots[i-1][1]-dots[i][1]);
        }
        answer = max1*max2;
        return answer;
    }
}