import java.util.*;

public class StringTokenizer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		
		StringTokenizer a = new StringTokenizer(input, ",");
		int c = a.countTokens(); 
		String [] b = new String[c];

		
		for (int i = 0; i < c; i++) {
			b[i] = a.nextToken(",");
			//System.out.println(b[i]);
			}
		Sorting(b);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		//같은 문자열의 개수를 찾자
		int temp2 = 0;
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (b[i] == b[j] || i != j) {
					temp2 ++;
				}
			}
			
		}
		System.out.println(temp2);
		
		
		
		
		//sorting 알고리즘
	}
	private static void Sorting(String []b){
		String temp;
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length-1; j++) {
				if(b[j].compareTo(b[j+1]) > 0) {
					temp = b[j];
					b[j] = b[j+1];
					b[j+1] = temp;
					
					
					
				}
			}
		}
		
	}

}
