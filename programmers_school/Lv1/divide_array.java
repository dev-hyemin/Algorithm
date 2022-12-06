import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> lists = new ArrayList<>(); 
        int temp = 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]%divisor==0) lists.add(arr[i]);
        }
        if (lists.size()==0) lists.add(-1);
        Collections.sort(lists);
        int[] answer = lists.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}