package baek_algorithm;

import java.util.Scanner;

public class Baek_1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = -1;
        int num = sc.nextInt();

        for (int i=0; i<num+1; i++){
            String word = sc.nextLine();
            int prev = 0;
            int [] arr = new int[26];
            boolean is_group = true;

            for (int j=0; j<word.length(); j++){
                if ((arr[word.charAt(j)-'a'] != 0) && prev != word.charAt(j)){
                    is_group = false;
                    break;
                } else {
                    arr[word.charAt(j)-'a']++;
                }
                prev = word.charAt(j);
            }
            if (is_group) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
