package makeStars;

public class MakeStars {

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				if(Math.abs(10-j) <= Math.abs(10-i)) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
					
				
			}
			System.out.println("");
		}
		
		
	
			
		}
		// TODO Auto-generated method stub

	}


