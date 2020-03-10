package baek_algorithm;
import java.util.*;
public class Beak_2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			int n2 = sc.nextInt();
			String s = sc.next();
			for(int j=0;j<s.length();j++) {
				//System.out.print(s.charAt(j)-'0');
				for(int k=0;k<n2;k++) {
					String data = s.substring(j,j+1);
					System.out.print(data);
				}
				
			}
			System.out.println(" ");
		}

	}

}
