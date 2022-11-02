class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String s = my_string.replaceAll("[^0-9]", " ");
        String[] temp = s.split(" ");
        for (String t: temp){
            if (t.isEmpty()==false) answer += Integer.parseInt(t);
        }
        return answer;
    }
}