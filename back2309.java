import java.util.Arrays;
import java.util.Scanner;

public class back2309 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] high = new int[9];
		int sum = 0;

		for (int i = 0; i < high.length; i++) { 
			high[i] = sc.nextInt();
			sum += high[i]; 
		}
		Arrays.sort(high); 
        System.out.println(high);
    }
}