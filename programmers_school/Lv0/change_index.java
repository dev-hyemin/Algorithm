class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char[] temps = my_string.toCharArray();
        char temp = ' ';
        if (1<my_string.length() && my_string.length()<100 && 0<=num1 && 0<=num2 && num1<my_string.length() && num2<my_string.length()){
            temp = temps[num1];
            temps[num1] = temps[num2];
            temps[num2] = temp;
            answer = new String(temps);
        }
        return answer;
    }
}