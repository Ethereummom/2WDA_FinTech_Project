package bronze1;

import java.util.Scanner;

public class _2609 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int max,min,ma,mi,r,maxi=0,mini=0;
		if (a>=b) {
			max=a;
			ma=a;
			min=b;
			mi=b;
		} else {
			max=b;
			ma=b;
			min=a;
			mi=a;
		}
		
		//find mini
		while (true) {
			if (max==min) {
				mini=max;
				break;
			} else if (max>min) {
				min=min+mi;
			} else {
				max=max+ma;
			}
		}
		
		if (a>=b) {
			max=a;
			min=b;
		} else {
			max=b;
			min=a;
		}
		//find maxi
		while (true) {
			if (max%min==0) {
				maxi=min;
				break;
			}
			r=max%min;
			max=min;
			min=r;
		}
		System.out.println(maxi);
		System.out.println(mini);

	}

}
