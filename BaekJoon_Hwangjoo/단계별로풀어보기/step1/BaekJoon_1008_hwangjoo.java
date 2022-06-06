package step1;
import java.util.Scanner;

public class BaekJoon_1008_hwangjoo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(0<a && b<10) {
			System.out.println((double)a/b);
		}

	}

}
