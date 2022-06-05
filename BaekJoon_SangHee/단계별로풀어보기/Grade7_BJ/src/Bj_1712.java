import java.util.Scanner;
public class Bj_1712 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		
		if(num2>=num3) {
			System.out.println(-1);
		}
		else {
			System.out.println(num1/(num3-num2)+1);
		}
	}
}
