package baek_algorithm;

import java.util.Scanner;

public class Baek_2739 {
	public static void main(String[] args){
        int s;
        int i;
        Scanner sc = new Scanner(System.in);           
        int n = sc.nextInt();     
        for(i=1;i<10;i++){
            s=n*i;
            System.out.println(n + " * " + i + " = " + s);
        }
	}
}
