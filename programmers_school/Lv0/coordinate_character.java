class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        for (String s: keyinput){
            switch(s){
                case "up": 
                    if (board[1]/2>answer[1]) answer[1] += 1;
                    break;
                case "down":
                    if (answer[1]<0){
                        if (board[1]/2>Math.abs(answer[1])) answer[1] -= 1;
                        break;
                    }
                    else {
                        if (board[1]/2>=answer[1]) answer[1] -= 1;
                        break;
                    }
                case "left":
                    if (answer[0]<0){
                        if (board[0]/2>Math.abs(answer[0])) answer[0] -= 1;
                        break;
                    }
                    else {
                        if (board[0]/2>=answer[0]) answer[0] -= 1;
                        break;
                    }
                case "right": 
                    if (board[0]/2>answer[0]) answer[0] += 1;
                    break;
            }
            System.out.printf("%s %s\n", answer[0], answer[1]);
        }
        return answer;
    }
}