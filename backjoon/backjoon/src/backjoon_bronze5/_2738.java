package backjoon_bronze5;

import java.util.*;

public class _2738 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][] arr1 = new int[n][m];
		int[][] arr2 = new int[n][m];
		int[][] sum = new int[n][m];
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				arr1[i][j]=scan.nextInt();
			}
		}
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				arr2[i][j]=scan.nextInt();
			}
		}
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				sum[i][j]=arr1[i][j]+arr2[i][j];
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}

	}

}
