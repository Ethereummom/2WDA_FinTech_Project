package bronze3;

import java.util.*;

public class _10871 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = scan.nextInt();
		for (int i=0; i<n; i++) {
			int num = scan.nextInt();
			if (num<x) {
				System.out.print(num+" ");
			}
		}

	}

}
