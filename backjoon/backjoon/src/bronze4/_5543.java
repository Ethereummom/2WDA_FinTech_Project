package bronze4;

import java.util.*;

public class _5543 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] hamburgers = new int[3];
		int[] drinks = new int[2];
		
		for (int i=0; i<3; i++) {
			hamburgers[i] = scan.nextInt();
		}
		for (int i=0; i<2; i++) {
			drinks[i] = scan.nextInt();
		}
		int hamburger=hamburgers[0],drink=drinks[0];
		for (int i=0; i<3; i++) {
			if (hamburgers[i]<=hamburger) {
				hamburger=hamburgers[i];
			}
		}
		for (int i=0; i<2; i++) {
			if (drinks[i]<=drink) {
				drink=drinks[i];
			}
		}
		System.out.println(hamburger+drink-50);
		
	}

}
