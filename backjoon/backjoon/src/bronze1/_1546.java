package bronze1;

import java.util.*;

public class _1546 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] score = new int[n];
		double max=0;
		for (int i=0; i<n; i++) {
			score[i]=scan.nextInt();
			max=Math.max(max, score[i]);
		}
		double[] new_score = new double[n];
		double sum=0;
		for (int i=0; i<n; i++) {
			new_score[i]=(score[i]/max)*100;
			sum+=new_score[i];
		}
		System.out.println(sum/n);

	}

}