import java.util.Scanner;
 
public class Bj_8958 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 
		String arr[] = new String[in.nextInt()];
 
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.next();
		}
		
		in.close();
		
		for (int i = 0; i < arr.length; i++) {
			
			int cnt = 0;	// ����Ƚ��
			int sum = 0;	// ���� �ջ� 
			
			for (int j = 0; j < arr[i].length(); j++) {
				
				if (arr[i].charAt(j) == 'O') {
					cnt++;
				} 
				else {
					cnt = 0;
				}
				sum += cnt;
			}
			
			System.out.println(sum);
		}
	}
}