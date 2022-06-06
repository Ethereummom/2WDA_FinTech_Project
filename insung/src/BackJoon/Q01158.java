package BackJoon;

import java.util.LinkedList;
import java.util.Scanner;

public class Q01158 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		LinkedList<Integer> arr = new LinkedList<>();

		for (int i = 1; i <= n; i++) {
			arr.add(i);
		}
		System.out.print("<");
		while (!arr.isEmpty()) {
			for (int i = 0; i < k; i++) {
				if (i == k - 1) {
					int a = arr.remove();
					if (arr.size() == 0)
						System.out.print(a);
					else
						System.out.print(a + ", ");
				} else {
					arr.add(arr.remove());
				}
			}
		}
		System.out.print(">");
	}
}