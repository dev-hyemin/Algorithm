package baek_algorithm;

import java.util.Scanner;

public class Baek_2738 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String[] temp = s.split(" ");

        int a = Integer.parseInt(temp[0]);
        int b = Integer.parseInt(temp[1]);

        int[][]arr = new int[a][b];

        for (int i=0; i<a; i++){
            s = sc.nextLine();
            temp = s.split(" ");

            for (int j=0; j<b; j++){
                arr[i][j] += Integer.parseInt(temp[j]);
            }
        }
        for (int i=0; i<a; i++){
            s = sc.nextLine();
            temp = s.split(" ");

            for (int j=0; j<b; j++){
                arr[i][j] += Integer.parseInt(temp[j]);
            }
        }
        for (int i=0; i<a; i++){
            for (int j=0; j<b; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
