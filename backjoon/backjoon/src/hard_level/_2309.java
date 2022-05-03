package hard_level;

import java.util.*;

public class _2309 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int[] dwarf = new int[9];
		for(int i=0; i<9; i++) {
			dwarf[i] = scan.nextInt();
			sum += dwarf[i];
		}
		Arrays.sort(dwarf);
		int fake_dwarf = sum - 100;
		int save, a=0, b=0;
		find :
		for (int i=0; i<8; i++) {
			for (int j=1; j<9; j++) {
				if (dwarf[i]+dwarf[j]==fake_dwarf) {
					a=i;
					b=j;
					break find;
				}
			}
		}
		for (int i=0; i<9; i++) {
			if (i != a && i != b) {
				System.out.println(dwarf[i]);
			}
		}

	}

}
