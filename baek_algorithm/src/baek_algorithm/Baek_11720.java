package baek_algorithm;
import java.util.*;
import java.util.ArrayList;
public class Beak_11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String input = sc.next();
		sc.close();
		int sum=0;
		for(int i=0;i<n;i++) {
			sum = sum + input.charAt(i)-'0';
		}
		System.out.println(sum);
	}

}
