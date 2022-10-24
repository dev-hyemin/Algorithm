import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] temps = new char[my_string.length()];
        char temp = ' ';
        if (1<=my_string.length() && my_string.length()<=1000){
            for (int i=0; i<my_string.length(); i++){
                temp = my_string.charAt(i);
                if (65<=(int)temp && (int)temp<=90){
                    temps[i] = Character.toLowerCase(temp);
                } else {
                    temps[i] = Character.toUpperCase(temp);
                }
            }
            answer = new String(temps);
        }
        return answer;
    }
}


// 아스키 코드 더해서 하는 방법

// class Solution {
//     public String solution(String my_string) {
//         String answer = "";
//         char temp = ' ';
//         if (1<=my_string.length() && my_string.length()<=1000){
//             for (int i=0; i<my_string.length(); i++){
//                 temp = my_string.charAt(i);
//                 if (65<=(int)temp && (int)temp<=90){
//                     answer += (char)(my_string.charAt(i)+32);
//                 } else {
//                     answer += (char)(my_string.charAt(i)-32);
//                 }
//             }
//         }
//         return answer;
//     }
// }