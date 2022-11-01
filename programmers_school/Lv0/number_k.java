class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String s = "";
        for(; i<=j; i++) s+=i;
        char[] arr = s.toCharArray();
        for(char c: arr){
            if (Character.getNumericValue(c)==k) answer++;
        }
        return answer;
    }
}