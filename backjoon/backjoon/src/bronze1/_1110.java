package bronze1;

import java.util.*;

public class _1110 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int cycle = n;
		int sibal=100;
		int count=0;
		while (n!=sibal) {
			cycle = (cycle%10*10)+((cycle/10+cycle%10)%10);
			sibal = cycle;
			count++;
		}
		System.out.println(count);

	}

}