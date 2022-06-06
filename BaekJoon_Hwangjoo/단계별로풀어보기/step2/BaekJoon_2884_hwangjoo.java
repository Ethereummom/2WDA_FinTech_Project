package step2;
import java.util.Scanner;

public class BaekJoon_2884_hwangjoo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		int sum = (H*60 + M)-45;
		int H2;
		int M2; 
		
		if(sum>=0) {
			H2 = sum/60;
			M2 = sum%60;
			System.out.println(H2+ " " +M2);
		}
		else if(sum<0) {
			H2 = 23;
			M2 = 60+sum;
			System.out.println(H2+ " " +M2);
		}

	}

}
