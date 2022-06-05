import java.util.Scanner;
 
public class Bj_2908 {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
        
		int A = in.nextInt();
		int B = in.nextInt();
        
        in.close();
        
		A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
		B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());
		//StringBuilder메써드 >> 구글링해보면 나옴,,
        //Int타입으로 받았으니까 append해줘야함 
		System.out.print(A > B ? A : B);
	
	}
}