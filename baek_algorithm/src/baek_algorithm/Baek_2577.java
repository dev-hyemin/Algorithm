package baek_algorithm;
import java.util.*;
public class Beak_2577 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int i,j;
		int sum=a*b*c;
		int[] num = new int[10];
		
		String temp=Integer.toString(sum);
		int[] n = new int[temp.length()];
		
		for(i=0;i<temp.length();i++) {
			n[i]=temp.charAt(i)-'0';
		}
		for(i=0;i<temp.length();i++) {
			for(j=0;j<10;j++) {
				if(n[i]==j) {
					num[j]=num[j]+1;
				}
			}
		}
		for(i=0;i<10;i++) {
			System.out.println(num[i]);
		}
	}
}
