package baek_algorithm;

import java.util.Scanner;

public class Baek_2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int [][] arr = new int[100][100];

        int total = 0;
        int width = 0, height = 0;

        for (int i=0; i<n; i++){
            String s = sc.nextLine();
            String[] temp = s.split(" ");

            width = Integer.parseInt(temp[0]);
            height = Integer.parseInt(temp[1]);

            for (int j=width; j<width+10; j++){
                for (int k=height; k<height+10; k++){
                    arr[j][k] ++;
                }
            }
        }
        for (int i=0; i<100; i++){
            for (int j=0; j<100; j++){
                if (arr[i][j] > 0){
                    total++;
                }
            }
        }
        System.out.println(total);
    }
}
