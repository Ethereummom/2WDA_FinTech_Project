package BackJoon;

import java.util.Scanner;

public class Q05554 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int goSchool = sc.nextInt();
		int goPC = sc.nextInt();
		int goAcademy = sc.nextInt();
		int goHome = sc.nextInt();
		
		int total = goSchool + goPC + goAcademy + goHome;
		int mi = total / 60;
		int sec = total % 60;
		
		System.out.println(mi);
		System.out.println(sec);
	}
}
