package step3;
import java.util.Scanner;

public class BaekJoon_8393_hwangjoo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for(int i=1; i<=n; i++) {
			sum+=i;
		}
		System.out.println(sum);

	}

}
