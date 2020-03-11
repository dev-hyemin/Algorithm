package baek_algorithm;
import java.util.*;
public class Baek_1110 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
		int l,r;
		int a=num;
		int i=0;
        while(true){
        	l=num/10;
			r=num%10;
			if(r+l<10) {
				num = r*10+(r+l);
			}else {
				num=(r*10)+(l+r)%10;
			}
			i++;
			if(a==num)break;
		}
		System.out.println(i);
	}
}
