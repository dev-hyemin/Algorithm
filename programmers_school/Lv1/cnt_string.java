class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String[] lists = s.toLowerCase().split("");
        int p = 0;
        int y = 0;
        for(String n: lists){
            if (n.equals("p")==true) p++;
            else if (n.equals("y")==true) y++;
        }
        if (p!=y) answer=false;

        return answer;
    }
}