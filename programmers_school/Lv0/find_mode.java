import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = -1;
        int cnt = 0;
        int max = -1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i: array){
            if (map.get(i)==null){
                cnt = 0;
                for (int j: array) if(i==j) cnt++;
                map.put(i, cnt);
            }
        }
        Set<Integer> keys = map.keySet();
        for (int key: keys) {
            if (map.get(key)>max){
                answer = key;
                max = map.get(key);
            } else if (map.get(key)==max) answer = -1;
        }
        return answer;
    }
}