import java.util.Scanner;

public class Bj_2798 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		int n = in.nextInt();
		int m = in.nextInt();
		int sum = 0;
		int temp = 0;
		
		int [] card_m = new int[n];
		
		for (int i = 0; i < n; i++) {
			card_m[i] = in.nextInt();
			}
		
		//카드의 갯수와 적힌 숫자 입력하기
		
		//브루트포스알고리즘
		for (int i = 0; i < n-2; i++) {
			for (int j = i+1; j < n; j++) {
				for(int k = j+1; k < n; k++) {
					sum = card_m[i] + card_m[j] + card_m[k];
					if (sum == m) {
						temp = sum;
						
						
					}
					if(m > sum && temp < sum) {
						temp = sum;
					}
				}
				
			}
			
		}
		System.out.print(temp);
	
	}
}
