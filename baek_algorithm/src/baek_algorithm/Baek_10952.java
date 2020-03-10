package baek_algorithm;
import java.util.Scanner;
public class Beak_10952 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){
			int a=sc.nextInt();
			int b=sc.nextInt();
			if(a==0&&b==0)break;
			System.out.println(a+b);
		}
		sc.close();
	}

}
