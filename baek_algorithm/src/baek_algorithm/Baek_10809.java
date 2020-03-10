package baek_algorithm;
import java.util.*;
import java.util.Scanner;

public class Beak_10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n=sc.next();
		String[] arr;
		int[] check = new int[26];
		for(int i=0;i<26;i++) {//배열 초기화
			check[i]=-1;
		}
		int[] alpa = new int[n.length()];
		for(int i=0;i<n.length();i++) {
			arr=n.split("");
			alpa[i] = arr[i].charAt(0);
		}
		for(int i=0;i<26;i++) {
			for(int j=0;j<alpa.length;j++) {
				if(check[i]==-1) {
					if((i+97)==alpa[j]) {
						check[i]=j;
					}
				}//중복 검사
			}
			System.out.print(check[i]+" ");
		}

	}

}
/*indexOf()함수 사용시
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        for (char c = 'a' ; c <= 'z' ; c++){
             System.out.print(input.indexOf(c) + " ");
        }
   }
 https://devpouch.tistory.com/13
 */ 
