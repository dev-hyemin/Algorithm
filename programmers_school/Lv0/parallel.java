import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int[] inclination = new int[6];
        int cnt = 0;
        for (int j=0; j<dots.length-1; j++){
            for (int k=j+1; k<dots.length; k++){
                inclination[cnt] = ((dots[j][0]-dots[k][0])-(dots[j][1]-dots[k][1]))/2;
                cnt++;
            }
        }
        for (int n: inclination){
            cnt = 0;
            for (int m: inclination) if (n==m) cnt++;
            if (cnt>1) answer = 1; break;
        }
        return answer;
    }
}