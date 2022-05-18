package backjoon;

import java.util.*;

public class _1152 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int count=0;
		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i)==' ') {
				count++;
			}
		}
		if (str.charAt(0) == ' ') {
			count--;
		}
		if (str.charAt(str.length()-1) == ' ') {
			count--;
		}
		count++;
		System.out.println(count);
	}

}