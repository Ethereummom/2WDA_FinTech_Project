package bronze4;

import java.util.*;

public class _2588 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int b_1 = b%10;
		int b_2 = b/10%10;
		int b_3 = b/100;
		System.out.println(b_1*a);
		System.out.println(b_2*a);
		System.out.println(b_3*a);
		System.out.println(b*a);

	}

}
