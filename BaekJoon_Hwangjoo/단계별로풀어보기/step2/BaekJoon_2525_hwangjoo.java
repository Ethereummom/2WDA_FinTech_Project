package step2;
import java.util.Scanner;

public class BaekJoon_2525_hwangjoo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		int addM = sc.nextInt();
		
		int sum = H*60 + M + addM;
		int H2;
		int M2;
		
		if(sum < 24*60) {
			H2 = sum/60;
			M2 = sum%60;
			System.out.println(H2 +" "+ M2);
		}
		else if(sum >= 24*60) {
			H2 = (sum-24*60)/60;
			M2 = (sum-24*60)%60;
			System.out.println(H2 +" "+ M2);
		}

	}

}