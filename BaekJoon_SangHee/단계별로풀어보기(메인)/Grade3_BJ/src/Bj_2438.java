import java.util.Scanner;
public class Bj_2438{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        
        for(int i =0 ; i<a; i++){
            for(int j = 0; j<a; j++){
                if (i>=j){
                System.out.print("*");
                }
            }
            System.out.println("");
                
        }
    }
}