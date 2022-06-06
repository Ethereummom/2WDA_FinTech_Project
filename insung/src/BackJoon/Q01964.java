package BackJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q01964 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		long point = 5;
		int count = 0;

		for (int i = 1; i < n; i++) {
			point += 5;
			if (i == 1)
				count += 2;
			else
				count += 3;
			point += count;
		}
		point %= 45678;

		String s = String.valueOf(point);

		bw.write(s);
		bw.flush();
		bw.close();
	}
}
