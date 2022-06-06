package step4;
import java.util.Scanner;

public class BaekJoon_2562_hwangjoo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0];
		for(int num:arr) {
			if(num>max)
				max=num;
		}
		int count=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==max)
				count = i+1;
		}
			
		System.out.println(max);
		System.out.println(count);

	}

}
