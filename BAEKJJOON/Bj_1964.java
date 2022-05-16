import java.util.Scanner;

public class Bj_1964 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		int n = in.nextInt();
		int hap = 1;
		long haptotal = (5 * n) + 2;
		
		
		if (n ==1 ) {
			System.out.println("5");
		}
		else if (n == 2) {
			System.out.println(haptotal);
		}
		else {
			for (int i = 1; i <= n-2; i++) {
				hap = 2 + (3*i);
				haptotal += hap;
				
				
				
			}
			System.out.println(haptotal%45678);
			
			
		}
		
		
	}

}
