package baek_algorithm;

import java.util.Scanner;

public class Baek_2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        word = word.replaceAll("c=", "?");
        word = word.replaceAll("dz=", "?");
        word = word.replaceAll("s=", "?");
        word = word.replaceAll("z=", "?");
        word = word.replaceAll("c-", "?");
        word = word.replaceAll("d-", "?");
        word = word.replaceAll("lj", "?");
        word = word.replaceAll("nj", "?");

        System.out.println(word.length());
    }
}
