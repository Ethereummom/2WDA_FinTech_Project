package bronze3;

import java.util.*;

public class _10818 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] nums = new int[n];
		int max,min;
		for (int i=0; i<n; i++) {
			nums[i] = scan.nextInt();
		}
		max=nums[0];
		min=nums[0];
		for (int i=0; i<n; i++) {
			max = Math.max(max, nums[i]);
			min = Math.min(min, nums[i]);
		}
		System.out.println(min+" "+max);

	}

}