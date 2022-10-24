import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        int temp = 0;
        char[] arr = my_string.toCharArray();
        if (0<my_string.length() && my_string.length()<100){
            for (int i=0; i<arr.length; i++){
                temp = arr[i];
                if (65<=temp && temp<=90){
                    temp += 32;
                }
                arr[i] = (char)temp;
            }
            Arrays.sort(arr);
            for (int i=0; i<arr.length; i++){
                answer += arr[i];
            }
        }
        return answer;
    }
}

//version 2
// import java.util.*;

// class Solution {
//     public String solution(String my_string) {
//         int temp = 0;
//         char[] arr = my_string.toLowerCase().toCharArray();
//         if (0<my_string.length() && my_string.length()<100){
//             Arrays.sort(arr);
//         }
//         return new String(arr);
//     }
// }