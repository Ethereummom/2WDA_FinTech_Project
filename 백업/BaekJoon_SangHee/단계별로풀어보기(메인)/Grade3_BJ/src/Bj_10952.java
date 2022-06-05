import java.util.Scanner;

public class Bj_10952{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a;
		int b;
		
		
		while(true) {
			a = in.nextInt();
			b = in.nextInt();
			
			if(a == 0 && b == 0) {
				break;
			
			}
			System.out.println(a+b);
		}
		
		

	}

}