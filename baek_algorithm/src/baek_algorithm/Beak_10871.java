package baek_algorithm;
import java.util.Scanner;
public class Beak_10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			if(a<x) {
				System.out.printf("%d ",a);
			}
		}
		sc.close();
	}

}
