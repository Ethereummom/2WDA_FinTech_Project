package step2;
import java.util.Scanner;

public class BaekJoon_2480_hwangjoo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum1;
		int sum2;
		int sum3;
		int max;
		
		if(a==b && b==c) {
			sum1 = 10000+a*1000;
			System.out.println(sum1);
		}else if(a==b || a==c || c==b) {
			if(a==b || a==c) {
				sum2 = 1000+a*100;
				System.out.println(sum2);
			}
			
			else if(c==b) {
				sum2 = 1000+c*100;
				System.out.println(sum2);
			}
		}else if(a!=b && b!=c && c!=a) {
			if(a>b && a>c) {
				sum3 = a*100;
				System.out.println(sum3);
			}
			else if(b>a && b>c) {
				sum3 = b*100;
				System.out.println(sum3);
			}
			else if(c>a && c>b) {
				sum3 = c*100;
				System.out.println(sum3);
			}
		}

	}

}
