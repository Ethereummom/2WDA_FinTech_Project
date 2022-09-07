package unknown;

import java.util.*;

public class _5597 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[28];
		for (int i=0; i<28; i++) {
			arr[i]=scan.nextInt();
		}
		a : for (int i=1; i<31; i++) {
			for (int j=0; j<28; j++) {
				if (i==arr[j]) {
					continue a;
				}
			}
			System.out.println(i);
		}

	}

}
