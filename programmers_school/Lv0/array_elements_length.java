class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for(int i=0; i<strlist.length; i++){
            if (1<=strlist[i].length() && strlist[i].length()<=100){
                answer[i] = strlist[i].length();
            }
        }
        return answer;
    }
}