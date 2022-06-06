/*
 * 세 자녀가 있는 가족이 있다.
 * 세 자녀의 나이차이는 동일
 * 막내와 중간의 나이를 알때 첫째의 나이를 출력하라.
 * */

package BackJoon;

import java.util.Scanner;

public class Q06749 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int last = sc.nextInt();
		int middle = sc.nextInt();
		
		int first = middle + middle - last;
		System.out.println(first);
	}
}
