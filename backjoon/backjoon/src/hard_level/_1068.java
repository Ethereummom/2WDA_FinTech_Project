package backjoon;

import java.util.Scanner;

public class _1068 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int hansu=0;
		if (N<100) {
			System.out.println(N);
		} else if (N==1000) {
			hansu=144;
			System.out.println(hansu);
		} else {
			for (int i=100; i<=N; i++) {
				int a = i/100;
				int b = ((i/10)%10);
				int c = i%10;
				if (a+c==b*2) {
					hansu++;
				}
			}
			hansu += 99;
			System.out.println(hansu);
		}

	}

}