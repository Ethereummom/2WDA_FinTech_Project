import java.util.Scanner;
 
public class back10871 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        for(int i=1; i<=n; i++) {
            int s = sc.nextInt();
            if(s<x) {
                System.out.println(s);
            }
        }
    }
}