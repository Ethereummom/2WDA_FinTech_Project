package bronze4;

import java.util.*;

public class _2525 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int h = c/60;
		int m = c%60;
		a = a+h;
		b = b+m;
		if (b>=60) {
			b=b-60;
			a=a+1;
		}
		if (a>=24) {
			a=a-24;
		}
		System.out.println(a+" "+b);

	}

}
