public class Bj_4673 {

	public static void main(String[] args) {
		

		int a1, a2, a3, a4, a5;
		int[] flag = new int[10000];
		
		int size = flag.length;
		for(int i=0;i<size ; i++) {
			flag[i] = 0;
		}
		
		
		for(int i=1; i<=10000;i++) {
			a1 = i%10;
			a2 = (i%100)/10;
			a3 = (i%1000)/100;
			a4 = (i%10000)/1000;
			a5 = (i%100000)/10000;
			
			int temp = i + a1 + a2 + a3 + a4 + a5;
			if(temp >10000) continue;
			flag[temp-1] = 1;
			
		}
		for(int i=0;i<size ; i++) {
			if(flag[i] == 0) {
				System.out.println(i+1);
			}
		}
		}
		

}