import java.util.Scanner;


public class Bj_11720 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		String a = in.next();
		
		int sum = 0;
		
		for(int i=0; i<N; i++){
			sum += a.charAt(i)-'0';
		}
		System.out.println(sum);
	}
}