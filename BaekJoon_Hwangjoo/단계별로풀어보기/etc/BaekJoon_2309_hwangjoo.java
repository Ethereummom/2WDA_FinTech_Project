package etc;
import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_2309_hwangjoo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		int[] high = new int[9];
		int sum = 0;
		int falseA = 0, falseB = 0;
		

		for (int i=0; i<high.length; i++) {
			high[i] = sc.nextInt();
			sum += high[i];

		}

		Arrays.sort(high);;

		for(int a=0; a<high.length-1; a++) {
			for(int b = a+1; b < high.length; b++) {
				if(sum - high[a] - high[b] == 100) {
					falseA = a;
					falseB = b;
					break;
				}
			}
		}

		for(int j=0; j<high.length; j++) {
			if(j == falseA || j == falseB)
				continue;
			System.out.println(high[j]);
		}
		sc.close();
	}

}
