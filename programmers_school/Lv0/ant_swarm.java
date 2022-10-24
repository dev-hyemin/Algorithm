class Solution {
    public int solution(int hp) {
        int answer = 0;
        if (0<=hp && hp<=1000){
            while(hp!=0){
                if (hp>=5){
                    answer += hp/5;
                    hp = hp%5;
                } else if (hp>=3){
                    answer += hp/3;
                    hp = hp%3;
                } else {
                    answer += hp;
                    break;
                }
            }
        }
        return answer;
    }
}

// version 2 - 생각해보니 while, if문 필요 없음
// class Solution {
//     public int solution(int hp) {
//         int answer = 0;
//         if (0<=hp && hp<=1000){
//             answer += hp/5;
//             hp = hp%5;
//             answer += hp/3;
//             hp = hp%3;
//             answer += hp;
//         }
//         return answer;
//     }
// }