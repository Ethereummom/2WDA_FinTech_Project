package BackJoon;

public class Q04673 {
	public static void main(String args[]) {
		boolean[] nums = new boolean[10001];
		// 셀프 넘버에 해당하는 배열의 boolean 값을 true로 바꾼다
		for (int i = 1; i < 10001; i++) {
			int n = sum(i);
			if(n < 10001) 
				nums[n] = true;
		}
		// false(셀프넘버인 수) 출력
		for (int i = 1; i < 10001; i++) {
			if (!nums[i])
				System.out.println(i);
		}
	}
// 셀프 넘버를 찾는 작업
	static int sum(int num) {
		int sum = num;
		while(num != 0) {
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}
}
