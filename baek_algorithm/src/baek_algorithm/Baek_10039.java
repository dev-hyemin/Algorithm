package baek_algorithm;

import java.util.Scanner;

public class Baek_10039 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int num = 5;
		for(int i=0;i<num;i++) {
			int n = sc.nextInt();
			if(n<40) {
				n=40;
			}
			sum +=n;
		}
		int avg = sum/num;
		System.out.println(avg);

	}

}
