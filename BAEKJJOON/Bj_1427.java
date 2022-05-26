import java.util.Scanner;

public class Bj_1427 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		String number = Integer.toString(N);
		int []k = new int[number.length()];
		int temp = 0;
		double sum = 0;
		for (int i = 0; i < number.length(); i++) {
			k[i] = (number.charAt(i) + '0');
			}
		System.out.println(k[0]);
		System.out.println(k[1]);
		
		for (int i2 = 0; i2 < number.length(); i2++) {
			for (int j = 0; j < number.length()-1; j++) {
				if (k[j] < k[j+1]) {
					temp = k[j+1];
					k[j+1] = k[j];
					k[j] = temp;
					
				}
			}
		}
		
		double temp2 = 0;
		double a = number.length();
		for (int j = 0; j < number.length(); j++) {
			temp2 = (Math.pow(10, a-j-1)) * k[j];
			
			sum = temp2+sum;
			
		}
		
		System.out.println(sum);	
		
		
		
	}
}

