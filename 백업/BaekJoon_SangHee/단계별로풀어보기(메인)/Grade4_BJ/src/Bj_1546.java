import java.util.Scanner;
public class Bj_1546 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		//����/M*100
		
		int n = sc.nextInt(); //�������� ����
		double score[] = new double[n]; //ó������ DOUBLEŸ������ �־ �Ҽ��� �����
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