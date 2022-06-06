package BackJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q01009 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		int a = 0, b;

		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			int temp = a;
			if (b == 1)
				a = 1;
			else {
				for (int j = 2; j <= b; j++) {
					temp *= a;
					temp %= 10;
				}
			}
			if (temp == 0)
				System.out.println(10);
			else
				System.out.printf("%1d%n", temp);
		}
	}
}