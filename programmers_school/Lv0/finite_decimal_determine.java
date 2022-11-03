class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        for (int i=2; i<=b; i++){ //2부터 b까지 공통 약수로 나누기
            if (a%i==0 && b%i==0){
                a /= i;
                b /= i;
            }
        }
        for (int i=2; i<=b; i++){  // 기약분수가 된 분모에서 2,5외에 나눠질 수 있는 수가 있는지 확인(i!=2로 했는데 이 경우 4,8로 나눠지는 경우도 2외의 수로 판별되어 수정)
            if (b%i==0 && i%2!=0 && i%5!=0) answer = 2;
        }
        return answer;
    }
}

// 다른 사람 풀이... 최대값이 1000이라서 아래처럼 풀면 된다고 함...
// int answer = ((a*1000)%b == 0) ? 1 : 2;
// return answer;