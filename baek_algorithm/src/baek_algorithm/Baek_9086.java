package baek_algorithm;

import java.util.Scanner;

public class Baek_9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr;
        int num = sc.nextInt();
        sc.nextLine();
        for (int i=0; i<num; i++){
            String word = sc.nextLine();
            arr = word.toCharArray();
            System.out.printf("%s%s\n", arr[0], arr[arr.length-1]);
        }
    }
}
