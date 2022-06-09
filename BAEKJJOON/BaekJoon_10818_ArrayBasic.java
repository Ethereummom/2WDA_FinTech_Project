import java.util.Scanner;

public class BaekJoon_10818_ArrayBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		int a[] = new int[N];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (a[i] >= a[j]) {
					a[i] = a[j];
					
				}
				
			}
			
		}

	}

}
