import java.util.HashMap;

class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] mor = letter.split(" ");
        HashMap<String,String> morse = new HashMap<String,String>(){{
            put(".-","a");
            put("-...","b");
            put("-.-.","c");
            put("-..","d");
            put(".","e");
            put("..-.","f");
            put("--.","g");
            put("....","h");
            put("..","i");
            put(".---","j");
            put("-.-","k");
            put(".-..","l");
            put("--","m");
            put("-.","n");
            put("---","o");
            put(".--.","p");
            put("--.-","q");
            put(".-.","r");
            put("...","s");
            put("-","t");
            put("..-","u");
            put("...-","v");
            put(".--","w");
            put("-..-","x");
            put("-.--","y");
            put("--..","z");
        }};
        for (int i=0; i<mor.length; i++){
            answer += morse.get(mor[i]);
        }
        return answer;
    }
}