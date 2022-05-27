package bronze2;

import java.util.*;

public class _2908 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int a_1 = a%10;
		int a_2 = a/10%10;
		int a_3 = a/100;
		int new_a = (a_1*100)+(a_2*10)+(a_3);
		int b_1 = b%10;
		int b_2 = b/10%10;
		int b_3 = b/100;
		int new_b = (b_1*100)+(b_2*10)+(b_3);
		if (new_a >= new_b) {
			System.out.println(new_a);
		} else {
			System.out.println(new_b);
		}

	}

}
