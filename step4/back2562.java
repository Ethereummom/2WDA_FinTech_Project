import java.util.Scanner;
public class back2562 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] number = new int[9];
		int max = 0;
		int seq = 0;
		for(int i = 0; i<9; i++) {
			number[i] = sc.nextInt();
		}
		for(int i=0; i<9; i++) {
			if(number[i]>max) {
				max = number[i];
				seq=i+1;
			}
		}
		System.out.println(max);
		System.out.println(seq);
	}
}