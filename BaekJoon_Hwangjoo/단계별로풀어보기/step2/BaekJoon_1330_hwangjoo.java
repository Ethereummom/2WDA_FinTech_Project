package step2;
import java.util.Scanner;

public class BaekJoon_1330_hwangjoo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A>B)
			System.out.println(">");
		else if(A<B)
			System.out.println("<");
		else if (A==B)
			System.out.println("==");

	}

}
