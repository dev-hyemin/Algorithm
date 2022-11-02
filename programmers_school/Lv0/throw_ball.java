import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        String[] temp = new String[spell.length];
        for (String s: dic){
            temp = s.split("");
            Arrays.sort(temp);
            Arrays.sort(spell);
            if (Arrays.equals(temp, spell)==true) return 1;
        }
        return answer;
    }
}