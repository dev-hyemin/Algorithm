package baek_algorithm;
import java.util.*;
public class Beak_11022 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=1;i<=t;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.printf("Case #%d: %d + %d = %d",i,a,b,a+b);
		}
		sc.close();
	}

}
