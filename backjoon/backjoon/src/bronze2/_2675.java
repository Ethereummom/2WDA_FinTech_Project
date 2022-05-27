package bronze2;

import java.util.*;

public class _2675 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for (int i=0; i<t; i++) {
			int r = scan.nextInt();
			String s = scan.next();
			for (int j=0; j<s.length(); j++) {
				for (int k=0; k<r; k++) {
					System.out.print(s.charAt(j));
				}
			}
			System.out.println();
		}

	}

}