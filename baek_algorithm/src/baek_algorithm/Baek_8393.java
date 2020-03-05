package baek_algorithm;
import java.util.Scanner;

public class Baek_8393 {
	public static void main(String[] args){
        Scanner scan = new Scanner(System.in);           
        int n = scan.nextInt(); 
        int s=0;
        for(int i=1;i<=n;i++){
            s=s+i;
        }
        System.out.println(s);
        scan.close();
	}
}
