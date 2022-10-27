import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int num = 0;
        if (0<array.length && array.length<100){
            Arrays.sort(array);
            num = array.length/2;
            answer = array[num];
        }
        return answer;
    }
}