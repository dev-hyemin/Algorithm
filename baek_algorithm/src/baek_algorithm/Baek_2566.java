package baek_algorithm;

import java.util.Scanner;

public class Baek_2566 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];
        int max = 0, col = 0, raw = 0;

        for (int i=0; i<9; i++){
            String s = sc.nextLine();
            String[] temp = s.split(" ");

            for (int j=0; j<9; j++){
                arr[i][j] += Integer.parseInt(temp[j]);
            }
        }
        for (int i=0; i<9; i++){
            for (int j=0; j<9; j++){
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    raw = j;
                    col = i;
                }
            }
        }
        System.out.println(max);
        System.out.printf("%d %d", col+1, raw+1);
    }
}
