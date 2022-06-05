import java.util.Scanner;

public class Bj_4344{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();  
		
		for(int i=0; i<C; i++) {    
			int[] N = new int[sc.nextInt()]; 
			int sum = 0; 
			int avg = 0;  
			int standard_cnt = 0;   
			float standard_avg = 0;   
			
			for(int j=0; j<N.length; j++) {
				N[j] = sc.nextInt();  
				sum += N[j]; 
			}
			
			avg = sum/(N.length); 
            
			for(int k=0; k<N.length; k++) {
				if(N[k] > avg) {
					standard_cnt++;  
				}
			}
            
			standard_avg = (float)standard_cnt/N.length * 100;  
			System.out.println(String.format("%.3f", standard_avg)+"%");
		}
		
		
	}
}