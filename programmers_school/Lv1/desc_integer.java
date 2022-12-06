import java.util.*;
import java.util.stream.Stream;

class Solution {
    public long solution(long n) {
        int[] digits = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();
        int temp = -1;
        String str = "";
        for(int i=0; i<digits.length; i++){
            for(int j=0; j<digits.length; j++){
                if (digits[i]>digits[j]){
                    temp = digits[j];
                    digits[j] = digits[i];
                    digits[i] = temp;
                }
            }
        }
        for(int i=0; i<digits.length; i++){
            str += Integer.toString(digits[i]);
        }
        
        return Long.parseLong(str);
    }
}