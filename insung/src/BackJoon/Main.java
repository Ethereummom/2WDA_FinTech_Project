package BackJoon;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.next();

		int n = (int) a.charAt(0) - '°¡' + 1;

		System.out.println(n);

	}
}
