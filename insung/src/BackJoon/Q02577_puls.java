package BackJoon;

import java.io.*;

public class Q02577_puls {
	static int n1, n2, n3;
	static int arr[] = new int[10];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n1 = Integer.parseInt(br.readLine());
		n2 = Integer.parseInt(br.readLine());
		n3 = Integer.parseInt(br.readLine());
		
		String mul = String.valueOf(n1 * n2 * n3);
		
		for (int i = 0; i < mul.length(); i++) {
//			int temp = Integer.parseInt(mul.substring(i, i+1));
			arr[mul.charAt(i)-'0']++;
		}
		
		for (int e : arr) {
			System.out.println(e);
		}
	}
}
