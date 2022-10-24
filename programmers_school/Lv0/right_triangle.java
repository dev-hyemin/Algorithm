import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String star = "";
        if (1<=n && n<=10){
            for (int i=1; i<=n; i++){
                star += '*';
                System.out.println(star);
            }
        }        
    }
}