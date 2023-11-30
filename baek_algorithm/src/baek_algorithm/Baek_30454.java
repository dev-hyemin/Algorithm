package baek_algorithm;

import java.util.Scanner;

public class Baek_30454 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();

        int [] line = new int[n];
        int max_line = 0;
        int result = 0;

        for (int i=0; i<n; i++){
            int cnt = 0;

            String m = sc.next();

            if (m.length() == l) {
                String [] s = m.split("0");

                for (int j=0; j<s.length; j++){
                    if (s[j] != ""){
                        cnt++;
                    }
                }
                line[i] = cnt;

                if (max_line <= cnt){
                    max_line = cnt;
                }
            }
        }

        for (int i=0; i<line.length; i++){
            if (max_line == line[i]){
                result++;
            }
        }

        System.out.printf("%d %d", max_line, result);
    }
}
