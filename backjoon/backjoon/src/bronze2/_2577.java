package bronze2;

import java.util.*;

public class _2577 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int sum = a*b*c;
		int ¿µ=0,ÀÏ=0,ÀÌ=0,»ï=0,»ç=0,¿À=0,À°=0,Ä¥=0,ÆÈ=0,±¸=0;
		String str = String.valueOf(sum);
		char[] chars = new char[str.length()];
		for (int i=0; i<str.length(); i++) {
			chars[i] = str.charAt(i);
			switch (chars[i]) {
			case '0' : ¿µ++;
			break;
			case '1' : ÀÏ++;
			break;
			case '2' : ÀÌ++;
			break;
			case '3' : »ï++;
			break;
			case '4' : »ç++;
			break;
			case '5' : ¿À++;
			break;
			case '6' : À°++;
			break;
			case '7' : Ä¥++;
			break;
			case '8' : ÆÈ++;
			break;
			case '9' : ±¸++;
			break;
			}
		}
		System.out.println(¿µ);
		System.out.println(ÀÏ);
		System.out.println(ÀÌ);
		System.out.println(»ï);
		System.out.println(»ç);
		System.out.println(¿À);
		System.out.println(À°);
		System.out.println(Ä¥);
		System.out.println(ÆÈ);
		System.out.println(±¸);
	}
}