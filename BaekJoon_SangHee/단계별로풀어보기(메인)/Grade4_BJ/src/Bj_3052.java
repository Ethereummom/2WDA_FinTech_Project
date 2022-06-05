import java.util.Scanner;

public class Bj_3052 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(src);
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[43];
		int cnt = 0;
		for (int i = 0; i < 10; i++) {
			int n = sc.nextInt();
			int key = n % 42;
			if (arr[key] == 0) {
				cnt++;
			}
			arr[key]++;
		}
		System.out.println(cnt);
	}

	private static String src = "39\r\n" + "40\r\n" + "41\r\n" + "42\r\n" + "43\r\n" + "44\r\n" + "82\r\n" + "83\r\n"
			+ "84\r\n" + "85";
}