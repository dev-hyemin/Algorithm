package baek_algorithm;
import java.util.*;
public class Baek_8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String[] arr;

		for(int i=0;i<n;i++) {
			String w=sc.next();
			arr=w.split("");
			int sum=0;
			int count=0;
			int[] alpa = new int[w.length()];
			for(int j=0;j<arr.length;j++) {
				alpa[j] = arr[j].charAt(0);
			}//아스키코드로 변환

			for(int j=0;j<alpa.length;j++) {
				if(alpa[j]==79) {
					count++;
				}else {
					count = 0;
				}
				sum += count;
			}
			System.out.println(sum);
		}
	}
}
