package bronze3;

import java.util.*;

public class _2884 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int m = scan.nextInt();
		if (m<45) {
			if (h!=0) {
				System.out.println(h-1+" "+(60-((m-45)*-1)));
			} else if (h==0) {
				System.out.println(23+" "+(60-((m-45)*-1)));
			}
		} else {
			System.out.println(h+" "+(m-45));
		}

	}

}
