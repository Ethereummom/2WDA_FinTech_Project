package BackJoon;

import java.util.Scanner;

public class Q02309_plus {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// 배열에 난쟁이 9명 키 입력 받고 총합 계산
		int[] arr = new int[9];
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			total += arr[i];
		}

		// 총합 - 100은 빌런 2명의 키
		int villain = total - 100;

		// 브루트 포스로 빌런 두명을 탐색
		searchVillian(villain, arr);
		
		// 버블 소트
		bubblesort(arr);

		//출력
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
		int temp = 0; // 임시변수
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