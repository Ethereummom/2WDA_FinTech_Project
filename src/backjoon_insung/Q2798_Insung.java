package backjoon_insung;

import java.util.Scanner;

public class Q2798_Insung {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// n�� ��ŭ�� �迭 ����
		byte n = sc.nextByte();
		int[] arr = new int[n];
		// ��ǥ�� m �Է�
		int m = sc.nextInt();
		// �迭�� �� �ֱ�
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int max = 0, sum = 0;
		a : for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					sum = arr[i] + arr[j] + arr[k];
					if (sum == m) {
						max = sum;
						break a;
					}
					if (sum > max && sum < m) {
						max = sum;
					}
					sum = 0;
				}
			}
		}
		System.out.println(max);
	}
}
