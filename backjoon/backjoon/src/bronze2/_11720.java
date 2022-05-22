package bronze2;

import java.util.*;

public class _11720 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		String str = scan.next();
		int sum=0;
		for (int i=0; t>i; i++) {
			sum+=(int)str.charAt(i)-'0';
		}
		System.out.println(sum);

	}

}