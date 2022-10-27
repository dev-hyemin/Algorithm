class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = new int[count(n, numlist)];
        int cnt = 0;
        if (1<=n && n<=10000 && 1<=numlist.length && numlist.length<=100){
            for (int i=0; i<numlist.length; i++){
                if (1<=numlist[i] && numlist[i]<=100000){
                    if (numlist[i]%n == 0) {
                        answer[cnt]=numlist[i];
                        cnt++;
                    }
                }
            }
        }
        return answer;
    }
    public int count(int n, int[] numlist){
        int cnt = 0;
        for (int i=0; i<numlist.length; i++){
            if (numlist[i]%n == 0) cnt++;
        }
        return cnt;
    }
}