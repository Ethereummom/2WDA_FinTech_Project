package BackJoon;

import java.util.Scanner;

public class Q02480 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		byte a = sc.nextByte();
		byte b = sc.nextByte();
		byte c = sc.nextByte();
		
		int result = 0;
		
		if (a == b && b == c && a == c) {
			result = a * 1000 + 10000;
		} else if (a == b || a == c) {
			result = a * 100 + 1000;
		} else if (b == c) {
			result = b * 100 + 1000;
		} else {
			result = Math.max(a, Math.max(b, c)) * 100;
		}
		System.out.println(result);
	}
}
