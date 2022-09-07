package backjoon_bronze5;

import java.util.*;

public class _10807 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		for (int i=0; i<n; i++) {
			arr[i]=scan.nextInt();
		}
		int v = scan.nextInt();
		int count=0;
		for (int i=0; i<n; i++) {
			if (arr[i] == v) {
				count++;
			}
		}
		System.out.println(count);

	}

}