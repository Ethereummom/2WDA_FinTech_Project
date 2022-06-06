public class back4673{

	public static void main(String[] args) {
		
		int index = 10000; 
		boolean[] nums = new boolean[index]; 
	
		for(int i=0; i<nums.length; i++) {
			if(d(i+1) < index+1)
				nums[d(i+1)-1] = true; 
		}
		for(int i=0; i<nums.length; i++) {
			if(nums[i] == false)
				
				System.out.println(i+1);
		}
	}
	static int d(int n) {
		int self = n;
		while(n > 0) { 
			self += (n % 10); 
			n /= 10; 
		}
		
		return self;
	}
}