package silver5;

import java.util.*;

public class _1181 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] strs = new String[n];
		String shrt;
		for (int i=0; i<n; i++) {
			strs[i]=scan.next();
		}
		for (int i=0; i<n-1; i++) {
			for (int j=i+1; j<n; j++) {
				if (strs[i].compareTo(strs[j])>=0) {
					shrt = strs[j];
					strs[j] = strs[i];
					strs[i] = shrt;
				}
				if (strs[i].length()>=strs[j].length()) {
					shrt = strs[j];
					strs[j] = strs[i];
					strs[i] = shrt;
				}
				if (strs[i].equals(strs[j])) {
					strs[j]="";
				}
			}
		}
		for (int i=0; i<n; i++) {
			if (strs[i]!="") {
				System.out.println(strs[i]);
			}
		}
	}
}