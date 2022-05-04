package hard_level;

import java.util.*;

public class _2798 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		int black = scan.nextInt();
		int[] cards = new int[count];
		for (int i=0; i<count; i++) {
			cards[i] = scan.nextInt();
		}
		int sum=0,max=0;
		for (int i=0; i<count-2; i++) {
			for (int j=1; j<count-1; j++) {
				for (int k=2; k<count; k++) {
					sum = cards[i]+cards[j]+cards[k];
					if (sum>=max && sum<=black && j!=k && i!=j && i!=k) {
						max = sum;
					}
				}
				
			}
		}
		System.out.println(max);
	}

}
