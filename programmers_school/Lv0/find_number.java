class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String s = Integer.toString(num);
        if (0<num && num<1000000 && 0<=k && k<10){
            answer = s.indexOf((char)k+'0');
            if (answer != -1) answer++;
        }
        return answer;
    }
}