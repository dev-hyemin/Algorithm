class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        if ((1<=s1.length && s1.length<=100) && (1<=s2.length && s2.length<=100)){
            for (int i=0; i<s1.length; i++){
                for (int j=0; j<s2.length; j++){
                    if ((1<=s1[i].length() && s1[i].length()<=10) && (1<=s2[j].length() && s2[j].length()<=10)){
                        if (s1[i].equals(s2[j])==true){
                            answer += 1;
                        }
                    }
                } 
            }
        }
        return answer;
    }
}