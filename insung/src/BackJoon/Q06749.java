/*
 * �� �ڳడ �ִ� ������ �ִ�.
 * �� �ڳ��� �������̴� ����
 * ������ �߰��� ���̸� �˶� ù°�� ���̸� ����϶�.
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
