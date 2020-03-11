package baek_algorithm;
import java.util.*;
public class Baek_1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt(); //과목의 갯수
		float[] arr = new float[n];
		int max=0;
		float sum=0;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();//과목 점수
			if(max<arr[i]) {//최고점 저장
				max=(int)arr[i];
			}
		}
		for(int i=0;i<n;i++) {
			arr[i]=arr[i]/max*100;
			sum=sum+arr[i];
		}
		sum=sum/n;
		System.out.println(sum);

	}

}
