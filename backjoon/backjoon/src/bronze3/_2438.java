package bronze3;

import java.util.*;

public class _2438 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i=0; i<n; i++) {
			for (int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
