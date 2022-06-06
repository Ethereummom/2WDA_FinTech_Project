package BackJoon;

import java.util.Scanner;

public class Q08958 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];


		for (int i = 0; i < n; i++) {
			int count = 0;
			int sum = 0;
			arr[i] = sc.next();
			for (int j = 0; j < arr[i].length(); j++) {
				switch (arr[i].charAt(j)) {
				case 'O':
					sum += ++count;
					break;
				case 'X':
					count = 0;
					break;
				}
			}
			System.out.println(sum);
		}
	}
}
