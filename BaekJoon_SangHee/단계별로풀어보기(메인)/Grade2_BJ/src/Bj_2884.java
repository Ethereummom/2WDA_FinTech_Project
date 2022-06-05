import java.util.Scanner;

public class Bj_2884 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		
		if(h == 0 && m < 45) {
			h = 23;
			m += 15;
		}
		else if(m < 45) {
			h--;
			m += 15;
		}
		else {
			m -= 45;
		}
		System.out.print(h + " " + m);
		}
}