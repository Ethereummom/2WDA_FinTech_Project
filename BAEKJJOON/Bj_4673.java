
public class Bj_4673 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		int []numbers = new int [10001];
		for (int i = 0; i < 10000; i++) {
			String convert = Integer.toString(i);
			int length = convert.length();
			for (int j = 0; j < length; j++) {
				char num = convert.charAt(j);
				sum += (int)num-'0';
				
			}
			sum = sum + i;
			numbers[i] = sum;
			sum = 0;
			
		}
		for (int i = 0; i < 10000 ;i++) {
			for (int j = 0; j < 10000; j++) {
				if (i == numbers[10000]) {
					System.out.println(i);
				}
				else
					break;
				
			}
			
			
		}

	}

}
