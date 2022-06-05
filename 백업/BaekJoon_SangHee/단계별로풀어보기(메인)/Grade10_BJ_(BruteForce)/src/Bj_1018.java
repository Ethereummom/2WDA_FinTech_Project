import java.util.Scanner;
 
public class Bj_1018{
 
	public static boolean[][] arr;
	public static int min = 64;
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
 
		int N = in.nextInt();
		int M = in.nextInt();
 
		arr = new boolean[N][M];
		
		for (int i = 0; i < N; i++) {
			String str = in.next();
			
			for (int j = 0; j < M; j++) {
				if (str.charAt(j) == 'W') {
					arr[i][j] = true;		 
				} else {
					arr[i][j] = false;		
				}
 
			}
		}
 
		
		int N_row = N - 7;
		int M_col = M - 7;
 
		for (int i = 0; i < N_row; i++) {
			for (int j = 0; j < M_col; j++) {
				search(i, j);
			}
		}
		System.out.println(min);
	}
 
	
	public static void search(int x, int y) {
		int end_x = x + 8;
		int end_y = y + 8;
		int count = 0;
 
		boolean AC = arr[x][y];	
		for (int i = x; i < end_x; i++) {
			for (int j = y; j < end_y; j++) {
 
				
				if (arr[i][j] != AC) {	
					count++;
				}
				
				AC = (!AC);
			}
			
			AC = !AC;
		}
		count = Math.min(count, 64 - count);
		min = Math.min(min, count);
	}
}