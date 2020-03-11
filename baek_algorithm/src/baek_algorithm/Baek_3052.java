package baek_algorithm;
import java.util.*;
public class Baek_3052 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int answer=0;
		int n;
		boolean[] arr = new boolean[42];//true, false배열
		for(int i=0;i<10;i++) {
			n=sc.nextInt()%42;
			if(!arr[n]) {//arr[n]가 거짓이면 참 -> 참이면 거짓
				answer++;
				arr[n]=true; //arr[n]가 새로 들어오면 true로 바꿔줘서 중복방지
			}
		}
		System.out.println(answer);
		
	}
}
