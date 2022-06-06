package BackJoon;

import java.util.Scanner;

public class Q03052 {
	public static void main(String args[]) {
		int[] arr = new int[42];
		
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			int a = sc.nextInt();
			a %= 42;
			arr[a]++;
		}
		
		int count = 0;
		for(int i : arr) {
			if (i > 0)
				count++;
		}
		
		System.out.println(count);
	}
}
