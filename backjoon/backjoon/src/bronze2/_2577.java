package bronze2;

import java.util.*;

public class _2577 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int sum = a*b*c;
		int ��=0,��=0,��=0,��=0,��=0,��=0,��=0,ĥ=0,��=0,��=0;
		String str = String.valueOf(sum);
		char[] chars = new char[str.length()];
		for (int i=0; i<str.length(); i++) {
			chars[i] = str.charAt(i);
			switch (chars[i]) {
			case '0' : ��++;
			break;
			case '1' : ��++;
			break;
			case '2' : ��++;
			break;
			case '3' : ��++;
			break;
			case '4' : ��++;
			break;
			case '5' : ��++;
			break;
			case '6' : ��++;
			break;
			case '7' : ĥ++;
			break;
			case '8' : ��++;
			break;
			case '9' : ��++;
			break;
			}
		}
		System.out.println(��);
		System.out.println(��);
		System.out.println(��);
		System.out.println(��);
		System.out.println(��);
		System.out.println(��);
		System.out.println(��);
		System.out.println(ĥ);
		System.out.println(��);
		System.out.println(��);
	}
}