package BackJoon;

import java.util.Scanner;

public class Q02562 {
	public static void main(String args[]) {
		int[] arr = new int[9];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = 0;
		for(int i : arr) {
			if (max < i)
				max = i;
		}
		System.out.println(max);
		
		int count= 0;
		for(int i : arr) {
			count++;
			if (max == i)
				break;
			
		}
		System.out.println(count);
	}
}
