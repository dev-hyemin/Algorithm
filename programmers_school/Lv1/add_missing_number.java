class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean is_none = true;
        for (int i=1; i<10; i++){
            is_none = true;
            for (int n: numbers) if (i==n) is_none = false;
            if (is_none==true) answer += i;
        }
        return answer;
    }
}