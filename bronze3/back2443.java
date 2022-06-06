import java.util.Scanner;
public class back2443 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		
		for(int i = N-1; i >= 0 ; i--) {
			for(int j = 1; j < N-i; j++)
				System.out.print(" ");
			for(int j = 0; j < i*2+1; j++)
				System.out.print("*");
			System.out.println();
		}

	}
}