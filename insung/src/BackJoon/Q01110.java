package BackJoon;

import java.util.Scanner;

public class Q01110 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int count = 0;

		int t = n;
		do {
			n = ((n % 10) * 10) + ((n / 10) + (n % 10)) % 10;
			count++;
		} while (n != t);
		System.out.println(count);
	}
}
