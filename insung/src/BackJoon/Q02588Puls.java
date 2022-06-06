/*
 * 
 * ���� ���� �ּ� : https://www.acmicpc.net/problem/2588
 * ++ 1~5�ڸ� ������ ���� �Է��ص� ��� ���
 * 
 */

package BackJoon;

import java.util.Scanner;

public class Q02588Puls {
	public static void main(String args[]) {
		int x, y;
		int total, numCount = 0;
		int nums[] = new int[5]; // ������� ���� �����ϱ� ���� �迭

		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		total = x * y;

		for (;;) {	// �ι�° ����� ���� ����ȭ
			nums[numCount++] = y % 10;
			y /= 10;
			if (y == 0)
				break;
		}
		
		int ans[] = new int[numCount+1]; // ������ �����ϱ� ���� �迭
		for (int i = 0; i < numCount; i++) {
			
			ans[i] = x * nums[i]; 
			System.out.printf("%d x %d = %d\n", x, nums[i], ans[i]);
		}
		System.out.println(total);

		

	}

}
