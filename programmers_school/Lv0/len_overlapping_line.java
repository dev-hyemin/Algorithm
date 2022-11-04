import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int cnt = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0; i<lines.length; i++){
            for(int j=lines[i][0]+1; j<=lines[i][1]; j++){
                if(map.get(j) == null) map.put(j, 1);
                else {
                    cnt = map.get(j) + 1;
                    map.put(j, cnt++);
                }
            } 
        }
        for (int value : map.values()) if(value>1) answer++;
        return answer;
    }
}