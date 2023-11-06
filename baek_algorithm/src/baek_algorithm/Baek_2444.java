package baek_algorithm;

import java.util.Scanner;

public class Baek_2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i=0; i<num-1; i++){
            System.out.print(" ".repeat(num-1-i));
            System.out.print("*".repeat(i*2+1));
            System.out.println();
        }
        for (int i=num-1; i>=0; i--){
            System.out.print(" ".repeat(num-1-i));
            System.out.print("*".repeat(i*2+1));
            System.out.println();
        }
    }
}
