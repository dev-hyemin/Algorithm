package baek_algorithm;
import java.util.*;
public class Beak_1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();//sc.nextLine().trim();
		input = input.trim();
		String[] data = input.split(" ");
		if(input.isEmpty()) {
			System.out.println(0);
		}else {
			System.out.println(data.length);
		}
	}
}
