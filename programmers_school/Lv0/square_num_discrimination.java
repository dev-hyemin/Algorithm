class Solution {
    // sqrt는 제곱근을 구하는 방법 (참고: https://coding-factory.tistory.com/532)
    // n이 제곱수라면 sqrt를 사용시 n.0과 같은 형식으로 나올 것, 아니면 n.111이런식으로 나오기에 double형과 int형으로 비교하여 문제 풀이
    // 더 간단한 풀이는 if (n % Math.sqrt(n) == 0)
    public int solution(int n) {
        int answer = 0;
        double num = 0;
        if (1<=n && n<=1000000){
            num = Math.sqrt(n);
            if ((int)num==num) answer = 1;
            else answer = 2;
        }
        return answer;
    }
}