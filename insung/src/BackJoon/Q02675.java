package BackJoon;

import java.util.Scanner;

public class Q02675 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int k = 0; k < t; k++) {
			int s = sc.nextInt();
			String p = sc.next();
			for (int i = 0; i < p.length(); i++) {
				for (int j = 0; j < s; j++) {
					System.out.print(p.charAt(i));
				}
			}
			System.out.println();
		}
	}
}
