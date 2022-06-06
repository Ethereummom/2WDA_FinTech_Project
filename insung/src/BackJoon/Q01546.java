package BackJoon;

import java.util.Scanner;

public class Q01546 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] arr = new double[n];
		double maxN = 0;
		double sum = 0;
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextDouble();
			if(maxN < arr[i])
				maxN = arr[i];
		}
		
		for(int i = 0; i< n; i++) {
			sum += arr[i] / maxN * 100;
		}
		
		System.out.println(sum / n);
	}

}
