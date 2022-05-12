package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;

public class _1934 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int T = Integer.parseInt(bf.readLine());
		int small;
		int min = 0,answer;
		for (int i=0; i<T; i++) {
			st = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			small = (a>=b) ? a : b;
			for (int j=1; j<=small; j++) {
				if (a%j==0 && b%j==0) {
					min=j;
				}
			}
			answer = a*b/min;
			bw.write(Integer.valueOf(answer)+"\n");
		}
		bw.flush();
		bw.close();
	}
	
}