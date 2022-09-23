package silver4;

import java.util.*;

public class _10828 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack stack = new Stack();
		int n = scan.nextInt();
		String[] command = new String[n];
		for (int i=0; i<n; i++) {
			command[i]="";
		}
		for (int i=0; i<n; i++) {
			command[i]=scan.next();
			if (command[i].equals("push")) {
				n++;
			}
			if (command[i-1].equals("push")) {
				stack.push(i);
			}
			if (command[i].equals("pop")) {
				if (!stack.empty()) {
					System.out.println(stack.pop());
				} else {
					System.out.println(-1);
				}
			}
			if (command[i].equals("size")) {
				System.out.println(stack.size());
			}
			if (command[i].equals("empty")) {
				if (stack.empty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
			}
		}

	}

}
