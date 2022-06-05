import java.util.Scanner;
public class Bj_2588{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int number2 = in.nextInt();
        
        System.out.println(number * (number2%10));
        System.out.println(number * ((number2%100)/10));
        System.out.println(number * (number2/100));
        System.out.println(number * number2);
        
        
    } 
}