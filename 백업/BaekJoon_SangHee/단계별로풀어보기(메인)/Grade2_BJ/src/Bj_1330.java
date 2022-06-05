import java.util.Scanner;
public class Bj_1330{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        
        if (a > b){
            System.out.println(">");
        }
        if (a < b){
            System.out.println("<");
        }
        if (a == b){
            System.out.println("==");
        }
    }
}