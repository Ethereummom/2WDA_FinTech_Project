import java.util.Scanner;

public class back2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println((x*x+y*y+z*z+a*a+b*b)%10);
        
        sc.close();

    }
}
