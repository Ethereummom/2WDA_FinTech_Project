import java.util.Scanner;

public class Bj_2562{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int [] a = new int[9];
		int temp = 0;
		int index = 0;
		
		for (int i = 0; i < 9; i++) {
			a[i] = in.nextInt();
			if (a[i] > temp) {
				temp = a[i];
				index = i + 1;
			}
			
		}
		System.out.println(temp);
		System.out.println(index);
			
	}

}