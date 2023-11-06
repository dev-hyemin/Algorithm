package baek_algorithm;

import java.util.Scanner;

public class Baek_25206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        double credit = 0;

        for (int i=0; i<20; i++){
            String word = sc.nextLine();
            String[] arr = word.split(" ");

            if (!arr[2].equals("P")){
                credit += Double.parseDouble(arr[1]);
            }

            if (arr[2].equals("A+")){
                total += Double.parseDouble(arr[1]) * 4.5;
            } else if (arr[2].equals("A0")){
                total += Double.parseDouble(arr[1]) * 4.0;
            } else if (arr[2].equals("B+")){
                total += Double.parseDouble(arr[1]) * 3.5;
            } else if (arr[2].equals("B0")){
                total += Double.parseDouble(arr[1]) * 3.0;
            } else if (arr[2].equals("C+")){
                total += Double.parseDouble(arr[1]) * 2.5;
            } else if (arr[2].equals("C0")){
                total += Double.parseDouble(arr[1]) * 2.0;
            } else if (arr[2].equals("D+")){
                total += Double.parseDouble(arr[1]) * 1.5;
            } else if (arr[2].equals("D0")){
                total += Double.parseDouble(arr[1]);
            }
        }
        System.out.printf("%.6f", total/credit);
    }
}
