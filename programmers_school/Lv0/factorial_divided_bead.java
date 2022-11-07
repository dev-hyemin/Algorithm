import java.math.*;

class Solution {
    public int solution(int balls, int share) {
        int answer = 0;
        BigInteger denominator = new BigInteger("1");
        BigInteger numerator = new BigInteger("1");
        
        denominator = cal(balls, denominator);
        numerator = cal(balls-share, numerator);
        numerator = cal(share, numerator);
        
		denominator = denominator.divide(numerator);
		answer = denominator.intValue();
        return answer;
    }
    private BigInteger cal(int range, BigInteger num){
        BigInteger temp = new BigInteger("1");
        for (int i=range; i>0; i--){
            temp = BigInteger.valueOf(i);
            num = num.multiply(temp);
        }
        return num;
    }
}