import java.util.Scanner;

public class Bj_10871{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int X = in.nextInt();
		
		int a[] = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = in.nextInt();
			if(a[i] < X) {
				System.out.println(a[i]);
			}
			
		}

	}

}
