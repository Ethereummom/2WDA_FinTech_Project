/*
 * 
 * 백준 문제 주소 : https://www.acmicpc.net/problem/2588
 * ++ 1~5자리 무작위 수를 입력해도 결과 출력
 * 
 */

package BackJoon;

import java.util.Scanner;

public class Q02588Puls {
	public static void main(String args[]) {
		int x, y;
		int total, numCount = 0;
		int nums[] = new int[5]; // 사용자의 값을 저장하기 위한 배열

		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		total = x * y;

		for (;;) {	// 두번째 사용자 값의 개별화
			nums[numCount++] = y % 10;
			y /= 10;
			if (y == 0)
				break;
		}
		
		int ans[] = new int[numCount+1]; // 정답을 저장하기 위한 배열
		for (int i = 0; i < numCount; i++) {
			
			ans[i] = x * nums[i]; 
			System.out.printf("%d x %d = %d\n", x, nums[i], ans[i]);
		}
		System.out.println(total);

		

	}

}
