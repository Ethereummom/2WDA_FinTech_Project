import java.util.Arrays;
import java.util.Scanner;

public class Bj_2750 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int []num = new int[N];
		
		
		for (int i = 0; i < N; i++) {
			num[i] = in.nextInt();
			
		}
		Arrays.sort(num);
		for (int i = 0; i < N; i++) {
			System.out.println(num[i]);
			
		}

	}

}
