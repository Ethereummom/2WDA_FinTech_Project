package backjoon_bronze5;

import java.util.*;

public class _10872 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if (n != 0) {
			int nn = n;
			while (n>1) {
				n--;
				nn *= n;
			}
			System.out.println(nn);
		} else {
			System.out.println(1);
		}

	}

}
