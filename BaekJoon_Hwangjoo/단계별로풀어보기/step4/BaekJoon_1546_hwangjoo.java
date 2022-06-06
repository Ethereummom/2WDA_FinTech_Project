package step4;
import java.util.Scanner;

public class BaekJoon_1546_hwangjoo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt(); 
		double[] subject = new double[count]; 
		int max = 0; 
		double sum = 0; 
		
		for(int i=0; i<count; i++) {
			subject[i] = sc.nextFloat();
			max = (int)Math.max(max, subject[i]);
		}
		
		for(int i=0; i<count; i++) {
			subject[i] = (double)subject[i] / max * 100;
			sum += subject[i];
		}
		
		System.out.println(sum/count);
	}

}
