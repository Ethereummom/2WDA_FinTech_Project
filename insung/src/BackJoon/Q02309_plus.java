package BackJoon;

import java.util.Scanner;

public class Q02309_plus {
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
		searchVillian(villain, arr);
		
		// ���� ��Ʈ
		bubblesort(arr);

		//���
		printArr(arr);
	}
	
	static int[] searchVillian(int villain, int[] arr) {
		a : for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (villain == arr[i] + arr[j]) {
					arr[i] = 0;
					arr[j] = 0;
					break a;
				}
			}
		}
		return arr;
	}
	
	static int[] bubblesort(int[] arr) {
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
		return arr;
	}
	
	static void printArr(int[] arr) {
		for (int i = 2; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
}