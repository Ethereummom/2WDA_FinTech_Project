package BackJoon;

public class Q04673 {
	public static void main(String args[]) {
		boolean[] nums = new boolean[10001];
		// ���� �ѹ��� �ش��ϴ� �迭�� boolean ���� true�� �ٲ۴�
		for (int i = 1; i < 10001; i++) {
			int n = sum(i);
			if(n < 10001) 
				nums[n] = true;
		}
		// false(�����ѹ��� ��) ���
		for (int i = 1; i < 10001; i++) {
			if (!nums[i])
				System.out.println(i);
		}
	}
// ���� �ѹ��� ã�� �۾�
	static int sum(int num) {
		int sum = num;
		while(num != 0) {
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}
}
