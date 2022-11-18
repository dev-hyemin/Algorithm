class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] temp = polynomial.split(" ");
        int x = 0;
        int num = 0;
        
        for (int i=0; i<temp.length; i+=2){
            if (temp[i].contains("x")==true) {
                if (temp[i].replace("x","") != "") x += Integer.parseInt(temp[i].replace("x",""));
                else x++;
            } else num += Integer.parseInt(temp[i]);
        }
        
        if ((x != 0) && (num != 0)) answer = Integer.toString(x) + "x + " + Integer.toString(num);
        else if ((x == 0) && (num != 0)) answer += Integer.toString(num);
        else if ((x != 0) && (num == 0)) answer += Integer.toString(x) + "x";
        
        if (answer.contains("x")){
            if (answer.substring(0, answer.indexOf("x")).equals("1")) answer = answer.replaceFirst("1", "");
        }
        return answer;
    }
}