public class Solution {
    public int solution(int n) {
        int answer = 0;
        String num = Integer.toString(n);
        String[] lists = new String[num.length()];
        lists = num.split("");
        for(String i: lists) answer+=Integer.parseInt(i);

        return answer;
    }
}