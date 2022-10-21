class Solution {
    public int[] solution(int n) {
        int cnt = 0;
        int[] answer = new int[array_size(n)];
        
        if (1<=n && n<=10000){
            for (int i=1; i<=n; i++){
                if (n%i==0){
                    answer[cnt] = i;
                    cnt++;
                }
            }
        }
        return answer;
    }
    public static int array_size(int n){
        int cnt = 0;
        for (int i=1; i<=n; i++){
            if (n%i==0) cnt++;
        }
        return cnt;
    }
}