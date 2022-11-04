class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        String[] temp = new String[5];
        for (int i=0; i<quiz.length; i++){
            temp = quiz[i].split(" ");
            if (temp[1].equals("+")){
                if (Integer.parseInt(temp[4])==Integer.parseInt(temp[0])+Integer.parseInt(temp[2])) answer[i] = "O";
                else answer[i] = "X";
            } else {
                if (Integer.parseInt(temp[4])==Integer.parseInt(temp[0])-Integer.parseInt(temp[2])) answer[i] = "O";
                else answer[i] = "X";
            }
        }
        return answer;
    }
}