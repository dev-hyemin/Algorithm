class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] arr = s.split(" ");
        for (int i=0; i<arr.length; i++){
            if(arr[i].equals("Z")){
                if(i==0) continue;
                else if(answer==0 && arr[i-1].equals("Z")) continue;
                else if(arr[i-1].equals("Z")) answer -= Integer.parseInt(arr[i-3]);  // 1 2 3 Z Z 의 경우는 빼고 빼고가 진행되어야 함
                else answer -= Integer.parseInt(arr[i-1]);
            }
            else answer += Integer.parseInt(arr[i]);
        }
        return answer;
    }
}