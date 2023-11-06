package baek_algorithm;
import java.util.Scanner;

public class Baek_27866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int num = sc.nextInt();
        char[] arr = word.toCharArray();
        System.out.println(arr[num-1]);
    }
}