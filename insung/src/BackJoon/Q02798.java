package BackJoon;

import java.util.Scanner;

public class Q02798 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// n개 만큼의 배열 생성
		byte n = sc.nextByte();
		int[] arr = new int[n];
		// 목표수 m 입력
		int m = sc.nextInt();
		// 배열에 수 넣기
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
