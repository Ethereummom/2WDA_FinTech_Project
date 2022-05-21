package bronze1;

import java.util.*;

public class _4344 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int c = scan.nextInt();
		for (int i=0; i<c; i++) {
			int n = scan.nextInt();
			byte[] score = new byte[n];
			double sum=0;
			for (int j=0; j<n; j++) {
				score[j]=scan.nextByte();
				sum+=score[j];
			}
			double avg = sum/n;
			int count=0;
			for (int k=0; k<n; k++) {
				if (score[k]>avg) {
					count++;
				}
			}
			System.out.println(String.format("%.3f",(double)count/n*100)+"%");
		}
	}
}