package bronze1;

import java.util.Scanner;

public class _10809 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		find : for (int i=97; i<=122; i++) {
			for (int j=0; j<s.length(); j++) {
				if (s.charAt(j)==i) {
					System.out.print(j+" ");
					continue find;
				}
				if (j==s.length()-1) {
					System.out.print(-1+" ");
				}
			}
		}
	}

}
