package bronze3;

import java.util.*;

public class _2493 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i=n; i>0; i--) {
			for (int j=1; j<=n; j++) {
				if (j<i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
