package baek_algorithm;

import java.util.Scanner;

public class Baek_1157 {
    public static void main(String[] args) {
        int max_cnt = 0;
        char max_al = '\0';

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        char[] arr = word.toUpperCase().toCharArray();
        int[] temp = new int[26];

        for (char c: arr){
            temp[c-'A']++;
        }

        for (int i=0; i<temp.length; i++){
            if (max_cnt < temp[i]){
                max_al = (char)(i+'A');
                max_cnt = temp[i];
            } else if ((max_cnt != 0) && (max_cnt == temp[i])){
                max_al = '?';
            }
        }
        System.out.println(max_al);
    }
}
