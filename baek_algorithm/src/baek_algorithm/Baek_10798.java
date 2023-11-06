package baek_algorithm;

import java.util.Scanner;

public class Baek_10798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] arr = new String[5][15];
        String result = "";

        for (int i=0; i<5; i++){
            String s = sc.nextLine();
            String[] temp = s.split("");

            for (int j=0; j<temp.length; j++){
                arr[i][j] = temp[j];
            }
        }
        for (int j=0; j<15; j++){
            for (int i=0; i<5; i++){
                if(arr[i][j]!=null){
                    result += arr[i][j];
                }
            }
        }
        System.out.println(result);
    }
}
