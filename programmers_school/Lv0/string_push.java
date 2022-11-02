class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        char[] temp = A.toCharArray();
        if (B.equals(A)==true) return 0;
        for (int i=1; i<=temp.length; i++){
            if (B.equals(A.substring(temp.length-i) + A.substring(0,temp.length-i))) return i;
        }
        return answer;
    }
}