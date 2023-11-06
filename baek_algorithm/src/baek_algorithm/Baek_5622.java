package baek_algorithm;

import java.util.Scanner;

public class Baek_5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        char[] arr = word.toCharArray();
        int sum = 0;

        for (int i=0; i<arr.length; i++){
            int num = (byte)arr[i];
            if (num >= 87){
                sum += 10;
            } else if (num >= 84 && num < 87) {
                sum += 9;
            } else if (num >= 80 && num < 84) {
                sum += 8;
            } else if (num >= 77 && num < 80) {
                sum += 7;
            } else if (num >= 74 && num < 77) {
                sum += 6;
            } else if (num >= 71 && num < 74) {
                sum += 5;
            } else if (num >= 68 && num < 71) {
                sum += 4;
            } else if (num >= 65 && num < 68) {
                sum += 3;
            }
        }
        System.out.println(sum);
    }
}
