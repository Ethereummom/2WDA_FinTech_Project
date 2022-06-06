package BackJoon;

import java.util.Scanner;

public class Q02525 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		
		m += c;
		while (m >= 60) {
			m -= 60;
			t++;
		}
		if (t >= 24) {
			t %= 24;
		}
		
		System.out.println(t + " " + m);
	}
}
