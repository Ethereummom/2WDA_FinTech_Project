import java.util.Scanner;

public class back11021 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        int x = sc.nextInt();

        for(int i = 1; i <= x; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int sum = A+B;
            System.out.println("Case #"+i+": "+sum);
        }
    }
}