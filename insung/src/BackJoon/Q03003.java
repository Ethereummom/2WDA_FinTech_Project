package BackJoon;

import java.util.Scanner;

public class Q03003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pis[] = new int[6];
		int num[] = { 1, 1, 2, 2, 2, 8 };
		for (int i = 0; i < 6; i++) {
			pis[i] = sc.nextInt();
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.print(num[i] - pis[i] + " ");
		}
		
	}
}