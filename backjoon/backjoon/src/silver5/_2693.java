package silver5;

import java.util.Scanner;

public class _2693 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[10];
		int[] answer = new int[n];
		int small;
		for (int i=0; i<n; i++) {
			for (int j=0; j<10; j++) {
				arr[j]=scan.nextInt();
			}
			for (int k=0; k<9; k++) {
				for (int l=k+1; l<10; l++) {
					if (arr[k]>arr[l]) {
						small=arr[l];
						arr[l]=arr[k];
						arr[k]=small;
					}
				}
			}
			answer[i]=arr[7];
		}
		for (int i=0; i<n; i++) {
			System.out.println(answer[i]);
		}


	}

}
