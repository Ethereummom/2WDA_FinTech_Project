package hard_level;

import java.util.*;

public class _1964 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a=4, b=7;
		for(int i=1; i<n; i++) {
			a += b;
			b += 3;
		}
		a += 1;
		System.out.println(a%45678);

	}

}
