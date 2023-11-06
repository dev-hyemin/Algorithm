package baek_algorithm;

import java.util.Scanner;

public class Baek_10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        char[] arr = word.toCharArray();
        char temp;

        for (int i=0; i<arr.length/2; i++){
            temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }

        String word2 = String.valueOf(arr);
        if (word.equals(word2)){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
