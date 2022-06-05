import java.util.Scanner;

public class Bj_2577{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		int D = A * B * C;
		
		String value = Integer.toString(D);
		for (int i = 0; i < 10; i++) {
			int count = 0;
			for (int j = 0; j < value.length(); j++) {
				if((value.charAt(j) - '0') == i) {
					count ++;
				}
				
			}
			System.out.println(count);
		}
		
		

	}

}