import java.util.Arrays;
import java.util.Scanner;

public class bJ_10818{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		int a[] = new int[N];
		
		for (int i = 0; i < N; i++) {
			a[i] = in.nextInt();
			
		}
		Arrays.sort(a);
		System.out.println(a[0] + " " + a[N-1]);

	}

}
