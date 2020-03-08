package baek_algorithm;
import java.util.*;
public class Beak_5543 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] burger = new int[3];
		int[] drink = new int[2];
		int[] set = new int[6];
		int min=4000;
		for(int i=0; i<3;i++) {
			burger[i]=sc.nextInt();
		}
		for(int i=0; i<2;i++) {
			drink[i]=sc.nextInt();
		}
		for(int k=0;k<6;k++) {
			for(int i=0;i<3;i++) {
				for(int j=0;j<2;j++) {
					set[k]=burger[i]+drink[j]-50;
					if(min>set[k]) {
						min=set[k];
					}
				}
			}
		}
		System.out.println(min);
		
	}

}
