class Solution {
    public int solution(int age) {
        int answer = 0;
        int current_year = 2022;
        if((0<age && age<=120)){
            answer = current_year - age + 1;
        }
        return answer;
    }
}