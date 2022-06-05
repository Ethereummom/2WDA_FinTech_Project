import java.util.Scanner;

public class Bj_2480{

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int dice1 = scanner.nextInt();
    int dice2 = scanner.nextInt();
    int dice3 = scanner.nextInt();
    
    scanner.close();
    
   
    if(dice1 == dice2 && dice1 == dice3 && dice2 == dice3) {
    	System.out.println(10000 + dice1*1000);
    }
    
    
    else if(dice1 == dice2 || dice1 == dice3) {
    	System.out.println(1000 + dice1*100);
    } else if(dice2 == dice3) {
    	System.out.println(1000 + dice2*100);
    }
    
   
    else {
    	int dice[] = new int[3];
        
        dice[0] = dice1;
        dice[1] = dice2;
        dice[2] = dice3;
        
        for(int i=1 ; i<3 ; i++) {
            for(int j=0 ; j<2 ; j++) {
                if(dice[j] < dice[j+1]) {
                    int temp = dice[j];
                    dice[j] = dice[j+1];
                    dice[j+1] = temp;
                }
            }
        }
    	System.out.println(dice[0]*100);
    }
    
	}
}
