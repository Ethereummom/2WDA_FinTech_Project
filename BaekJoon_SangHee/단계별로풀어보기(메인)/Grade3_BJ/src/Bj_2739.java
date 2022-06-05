import java.util.Scanner;
public class Bj_2739{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int dan = in.nextInt();
        int sum;
        for(int i=1;i<10;i++){
            sum = dan * i;
            System.out.println(dan + " * " + i + " = " + sum);
        }
    }
}