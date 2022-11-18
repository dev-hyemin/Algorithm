class Solution {
    public int solution(int[] common) {
        int answer = common[0];
        int rule = common[1] - common[0];
        if (common[1]+rule==common[2]) for (int i=0; i<common.length; i++) answer += rule;
        else for (int i=0; i<common.length; i++) answer *= common[1]/common[0];
        return answer;
    }
}