import java.util.*;

class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        int cnt = 0;
        for(char c: arr){
            cnt = 0;
            for(char d: arr){
                if(c==d) cnt++;
            }
            if(cnt==1) answer+=c;
        }
        char[] temp = answer.toCharArray();
        Arrays.sort(temp);
        return new String(temp);
    }
}