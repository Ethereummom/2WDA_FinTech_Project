package step3;
import java.util.Scanner;

public class BaekJoon_10952_hwangjoo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A;
		int B;
		
		do {
			A = sc.nextInt();
			B = sc.nextInt();
			if(A!=0 || B!=0)
				System.out.println(A+B);
			
		}
		while(A!=0 || B!=0);

	}

}
