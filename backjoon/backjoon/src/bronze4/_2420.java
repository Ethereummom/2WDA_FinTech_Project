package bronze4;

import java.util.*;

public class _2420 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long N = scan.nextLong();
		long M = scan.nextLong();
		
		long result = N-M;
		if (result<0) {
			result = result*-1;
		}
		System.out.println(result);

	}

}
