class Solution {
    // 피자는 무조건 7개씩 쪼개지기 때문에 나머지가 없는 경우는 7로 나눠지는 만큼 주문하고, 아닌 경우는 +1 하도록
    public int solution(int n) {
        int answer = 0;
        if (1<=n && n<=100){
            if (n%7==0){
                answer = n/7;
            } else {
                answer = n/7 + 1;
            }
        }
        return answer;
    }
}