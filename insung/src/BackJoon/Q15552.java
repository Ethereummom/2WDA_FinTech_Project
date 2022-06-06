package BackJoon;

import java.io.*;
import java.util.StringTokenizer;


public class Q15552 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(bf.readLine());
		
		int a,b;
		String c;
		for (int i = 0; i < t; i++) {
			String s = bf.readLine();
			StringTokenizer st = new StringTokenizer(s);
			/*
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			c = String.valueOf(a+b);
			bw.write(c);
			bw.newLine();
			*/
			
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) +"\n");
			}
		bw.flush();
	}
}
