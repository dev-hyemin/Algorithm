class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String s = my_string.replaceAll("[^0-9]","");
        char[] test = s.toCharArray();
        for (int i=0; i<test.length; i++){
            answer += Character.getNumericValue(test[i]);
        }
		return answer;
	}
}

// class Solution {
//     public int solution(String my_string) {
//         int answer = 0;
//         String s = my_string.replaceAll("[^0-9]","");
//         for (int i=0; i<s.length(); i++){
//             answer += Character.getNumericValue(s.charAt(i));
//         }
// 		return answer;
// 	}
// }