package baek_algorithm;
import java.util.*;
public class Beak_2562 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] n = new int[10];
		int max=0, count=0,i;
		for(i=1;i<10;i++) {
			n[i]=sc.nextInt();
			if(n[i]>max) {
				max=n[i];
				count=i;
			}
		}
		System.out.println(max);
		System.out.println(count);

	}

}
