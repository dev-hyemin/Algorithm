class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int[] result = new int[numlist.length];
        int temp = 0;
        for(int i=0; i<numlist.length; i++){
            result[i] = Math.abs(numlist[i]-n);
        }
        for(int i=0; i<numlist.length; i++){
            for(int j=0; j<numlist.length; j++){
                if(result[i]<result[j]){
                    temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                    
                    temp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = temp;
                } else if (result[i]==result[j]){
                    if(numlist[i]>numlist[j]){
                        temp = result[i];
                        result[i] = result[j];
                        result[j] = temp;

                        temp = numlist[i];
                        numlist[i] = numlist[j];
                        numlist[j] = temp;
                    }
                }
            }
        }
        answer = numlist;
        return answer;
    }
}