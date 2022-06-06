package step3;
import java.util.Scanner;

public class BaekJoon_11021_hwangjoo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int A;
		int B;
		
		for(int i=1; i<=T; i++) {
			A = sc.nextInt();
			B = sc.nextInt();
			System.out.println("Case #"+i+": "+(A+B));
		}

	}

}
