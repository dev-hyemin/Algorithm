class Solution {
    public int[] solution(long n) {
        String[] num = Long.toString(n).split("");
        int[] answer = new int[num.length];
        for(int i=0; i<num.length; i++) answer[i] = Integer.parseInt(num[num.length-1-i]);
        return answer;
    }
}