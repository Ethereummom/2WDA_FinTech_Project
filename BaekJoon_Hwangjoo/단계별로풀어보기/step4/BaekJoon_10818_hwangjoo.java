package step4;
import java.util.Scanner;

public class BaekJoon_10818_hwangjoo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0];
		for(int num:arr) {
			if(num>max)
				max = num;
		}
		
		int min = arr[0];
		for(int num:arr) {
			if(num<min)
				min = num;
		}
		
		System.out.println(min + " " + max);

	}

}
