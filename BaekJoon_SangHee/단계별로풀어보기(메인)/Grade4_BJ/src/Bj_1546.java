import java.util.Scanner;
public class Bj_1546 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		//점수/M*100
		
		int n = sc.nextInt(); //본과목의 갯수
		double score[] = new double[n]; //처음부터 DOUBLE타입으로 주어서 소숫점 만들기
		for(int i=0; i<n; i++) {
			score[i] = sc.nextInt();
		}
		double m = score[0];
		double sum = 0;
		for(int i=1; i<n; i++) {
			if( m < score[i]) {
				m = score[i];
			}

		}
		for(int i=0;i<n; i++) {
			score[i]= score[i]/m*100;
			sum += score[i];
		}
	
		System.out.println(sum/n);
		
		 sc.close();
		 
	}

}