package bronze2;

import java.util.*;

public class _2562 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] nums = new int[9];
		int max=0;
		int count=0;
		for (int i=0; i<9; i++) {
			nums[i]=scan.nextInt();
			max=Math.max(max, nums[i]);
			if (nums[i]==max) {
				count=i+1;
			}
		}
		System.out.println(max);
		System.out.println(count);

	}

}