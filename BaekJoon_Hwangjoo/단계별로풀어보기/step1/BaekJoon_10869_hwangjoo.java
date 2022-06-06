package step1;
import java.util.*;

public class BaekJoon_10869_hwangjoo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		StringTokenizer b = new StringTokenizer(a, ",");
		int c = b.countTokens();
		
		String[] arr = new String[c];
		
		
		/*int i = 0;
		while(b.hasMoreTokens()) {
			arr[i] = b.nextToken();
			i++;
			
			System.out.println(arr[i-1]);
		}*/
		for(int i=0; i<arr.length; i++) {
			arr[i] = b.nextToken();
		}
		sortArray(arr);
		for(int j=0; j<arr.length; j++)
			System.out.println(arr[j]);
			

	}
	private static void sortArray(String []arr) {
		String temp;
		for(int i=1; i<arr.length; i++) {
			for(int j=0; j<arr.length-i; j++) {
				if(arr[j].compareTo(arr[j+1])>0) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

}
