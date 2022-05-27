package silver3;

import java.util.*;

public class _11047 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] money = new int[n];
		for (int i=0; i<n; i++) {
			money[i] = scan.nextInt();
		}
		int count=0;
		int i = n-1;
		while (true) {
			if (k-money[i]<0) {
				i--;
			}
			if (k-money[i]>0) {
				while (k-money[i]>0) {
					k=k-money[i];
					count++;
				}
			}
			if (k-money[i]==0) {
				count++;
				break;
			}
		}
		System.out.println(count);

	}

}