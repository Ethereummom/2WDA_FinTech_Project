package homework;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon2309 {
	
	public static void main(String[] args) {
		// 경우의수 찾기 9C2 = 9*8 /2*1 = 36
		// 9명중 2명의 일곱난쟁이가 아닌 사람 찾기
		int nan1 = 0;
		int nan2 = 0;
		Scanner input = new Scanner(System.in);
		int [] arr = new int [9];
		int sum = 0;
			for (int i = 0; i < 9; i++) {
				arr[i] = input.nextInt();
				sum+= arr[i];
				
			}
		int diff = sum - 100;
			for (int i = 0; i <= 7; i++) {
				for (int j = 1; j <= 8; j++) {
					if(arr[i] + arr[j] == diff) {
						nan1 = arr[i];
						nan2 = arr[j];
						break;
					}
				}
				
			}
			Arrays.sort(arr);
			for (int i = 0; i < 9; i++) {
				if(arr[i] == nan1 || arr[i] ==nan2) {
				
				}
				else {
					System.out.println(arr[i]);
				}
			}
			
		
		
		

	}

}
