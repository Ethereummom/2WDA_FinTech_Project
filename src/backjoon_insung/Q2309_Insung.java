package backjoon_insung;

import java.util.Arrays;
import java.util.Scanner;

public class Q2309_Insung {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// �迭�� ������ 9�� Ű �Է� �ް� ���� ���
		int[] arr = new int[9];
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			total += arr[i];
		}

		// ���� - 100�� ���� 2���� Ű
		int villain = total - 100;

		// ���Ʈ ������ ���� �θ��� Ž��
		a : for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (villain == arr[i] + arr[j]) {
					arr[i] = 0;
					arr[j] = 0;
					break a;
				}
			}
		}
		// ���� ��Ʈ
//		Arrays.sort(arr);
		int temp = 0; // �ӽú���
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int i = 2; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
