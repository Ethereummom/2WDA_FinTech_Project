package etc;
import java.util.Scanner;

public class BaekJoon_1964_hwangjoo {

	public static void main(String[] args) {
		int N;
		long reminder;
		long sum = 1;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		
		if( 1<=N && N<=10000000) {
			for(int i=1; i<=N; i++) {
				sum += (3*i+1);
			}
			reminder = sum % 45678;
			System.out.println(reminder);
		 }
		}

}
