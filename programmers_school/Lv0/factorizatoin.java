import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int cnt = n;
        for (int i=2; i<=cnt; i++){
            while(true){
                if (n%i==0){
                    if (arr.contains(i)==false) arr.add(i);
                    n /= i;
                } else break;
            }
        }
        int[] answer = new int[arr.size()];
        for (int i=0; i<answer.length; i++) answer[i] = arr.get(i);
        return answer;
    }
}