package step3;
import java.util.Scanner;

public class BaekJoon_11022_hwangjoo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int A;
		int B;
		int C;
		
		for(int i=1; i<=T; i++) {
			A = sc.nextInt();
			B = sc.nextInt();
			C = A + B;
			System.out.println("Case #"+i+": "+(int)A+" + "+(int)B+" = "+(int)C);
		}
	}

}
