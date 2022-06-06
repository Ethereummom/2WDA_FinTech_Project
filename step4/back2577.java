import java.util.Scanner;
public class back2577{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
      
		int[] counts = new int[10];
		int t = a * b * c;
		while (t > 0) {
			counts[t % 10]++;
			t /= 10;
		}
		for (int i=0; i < counts.length; ++i) {
			System.out.println(counts[i]);
		}
	}
}