package bronze2;

import java.util.*;

public class _3052 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] rest = new int[10];
		int count=0;
		for (int i=0; i<10; i++) {
			int num = scan.nextInt();
			rest[i] = num%42;
			if (i>=1) {
				for (int j=0; j<i; j++) {
					if (rest[i]==rest[j]) {
						rest[i]=42;
					}
				}
			}
			if (rest[i]!=42) {
				count++;
			}
		}
		System.out.println(count);

	}

}