import java.util.Scanner;

//더하기 사이클

public class Bj_1110{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
        in.close();
		int a = N;
		int try_ = 0;
		
		while(true) {
			
			N = ((N%10) *10) +((N/10)+(N%10))%10;
			try_++;
			if (a == N) {
				break;
			}
			
		}
		System.out.println(try_);
	}

}
