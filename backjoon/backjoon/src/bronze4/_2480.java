package bronze4;

import java.util.*;

public class _2480 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		if (a==b && b==c && a==c) {
			System.out.println(a*1000+10000);
		} else if (a!=b && b!=c && a!=c) {
			System.out.println(Math.max(Math.max(a,b),c)*100);
		} else {
			if (a==b) {
				System.out.println(a*100+1000);
			} else if (b==c) {
				System.out.println(b*100+1000);
			} else if (a==c) {
				System.out.println(a*100+1000);
			}
		}

	}

}
