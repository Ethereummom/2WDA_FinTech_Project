import java.util.Scanner;
	public class back3052 { // 백준 3052 번 문제
	public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in); 
    		int[] arr = new int[10];
    		int temp = 0;
    		int count = 0;

    			for ( int i = 0; i < 10; i++ ) {
      				arr[i] = scanner.nextInt() % 42;
   				}

    			for ( int i = 0; i < 10; i++ ) {
    				temp = 0;
      				for ( int k = i+1; k < 10; k++ ) {
        				if ( arr[i] == arr[k] ) {
         				 temp ++;
        				}
      				}
      				if ( temp == 0 ) {
        				count ++;
					  }
				}

   			System.out.println(count);
  	}
}