package step3;
import java.util.Scanner;

public class BaekJoon_10871_hwangjoo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int A;
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<=N; i++) {
			A = sc.nextInt();
			if(A<X)
				sb.append(A+" ");
		}
		System.out.println(sb);
	}
}
