package BackJoon;

import java.util.Scanner;

public class Q02577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		String mul = String.valueOf(n1 * n2 * n3);
		int array[] = new int[10];
		for (int i = 0; i < mul.length(); i++) {
			int tmp = (mul.charAt(i));
			switch (tmp) {
			case 48:
				array[0] += 1;
				break;
			case 49:
				array[1]++;
				break;
			case 50:
				array[2]++;
				break;
			case 51:
				array[3]++;
				break;
			case 52:
				array[4]++;
				break;
			case 53:
				array[5]++;
				break;
			case 54:
				array[6]++;
				break;
			case 55:
				array[7]++;
				break;
			case 56:
				array[8]++;
				break;
			case 57:
				array[9]++;
				break;
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}