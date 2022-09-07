package backjoon_bronze5;

import java.util.*;

public class _2744 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i)>90) {
				char ch = (char) (str.charAt(i)-32);
				System.out.print(ch);
			} else {
				char ch = (char) (str.charAt(i)+32);
				System.out.print(ch);
			}
		}

	}

}
