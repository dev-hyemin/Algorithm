package baek_algorithm;

import java.util.Scanner;

public class Baek_30455 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n%2 == 0) {
            System.out.println("Duck");
        } else {
            System.out.println("Goose");
        }
    }
}
