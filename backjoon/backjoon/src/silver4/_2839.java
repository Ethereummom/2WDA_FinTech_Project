package silver4;

import java.util.Scanner;

public class _2839 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int oh=0,sam=0;
		if (n>7) {
			if (n%5==0) {
				System.out.println(n/5);
			} else {
				while (n%5!=0) {
					n=n-3;
					sam++;
				}
				oh=n/5;
				System.out.println(sam+oh);
			}
		} else if (n==3 || n==5) {
			System.out.println(1);
		} else if (n==6) {
			System.out.println(2);
		} else {
			System.out.println(-1);
		}

	}

}
