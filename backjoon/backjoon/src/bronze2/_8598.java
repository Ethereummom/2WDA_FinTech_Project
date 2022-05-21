package bronze2;

import java.util.*;

public class _8598 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		String[] ox = new String[t];
		for (int i=0; i<t; i++) {
			ox[i]=scan.next();
		}
		int score=0;
		int sum=0;
		for (int i=0; i<ox.length; i++) {
			for (int j=0; j<ox[i].length(); j++) {
				if (ox[i].charAt(j)=='O') {
					score++;
					sum+=score;
				} else if (ox[i].charAt(j)=='X') {
					score=0;
				}
			}
			System.out.println(sum);
			score=0;
			sum=0;
		}
	}
}
