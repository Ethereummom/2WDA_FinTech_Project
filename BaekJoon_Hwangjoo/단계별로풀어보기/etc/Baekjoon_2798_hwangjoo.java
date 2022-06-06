package etc;
import java.util.Scanner;

public class Baekjoon_2798_hwangjoo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, M;
		N = sc.nextInt();
		M = sc.nextInt();
		int sum = 0;
		int max = 0;
		
		int card[] = new int[N];
		for(int i=0; i<N; i++) {
			card[i] = sc.nextInt();
		}
		
		for(int i=0; i<N; i++) {
			for(int j=i+1; j<N; j++) {
				for(int k=j+1; k<N; k++) {
					sum = card[i] + card[j] + card[k];
					
					if(max < sum && sum <= M)
						max = sum;
				}
			}
		}
		System.out.println(max);

	}

}
