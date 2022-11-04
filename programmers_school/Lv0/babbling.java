class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] word = {"aya", "ye", "woo", "ma"};
        for(String bab: babbling){
            for (String w: word) bab = bab.replaceAll(w," ");
            if(bab.replaceAll(" ","").equals("")) answer++; 
        }
        return answer;
    }
}