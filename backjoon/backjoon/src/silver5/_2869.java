package silver5;

import java.util.Scanner;

public class _2869 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int v = scan.nextInt();
		int day = (v-b)/(a-b);
		if ((v-b)%(a-b)!=0) {
			System.out.println(day+1);
		} else {
			System.out.println(day);
		}
	}

}