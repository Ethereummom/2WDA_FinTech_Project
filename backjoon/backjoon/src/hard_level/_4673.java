package hard_level;

public class _4673 {

	public static void main(String[] args) {
		int sum = 0;
		int[] numbers = new int[10001];
		for (int i=0; i<=10000; i++) {
			String change = Integer.toString(i);
			int length = change.length();
			for (int j=0; j<length; j++) {
				char num = change.charAt(j);
				sum += (int)num-'0';
			}
			sum += i;
			numbers[i] = sum;
			sum = 0;
		} // 생성자 숫자를 배열 numbers에 넣는다.
		for (int j=1; j<=10000; j++) {
			for (int e : numbers) {
				if (e == numbers[10000]) {
					System.out.println(j);
					break;
				}
				if (j == e) {
					break;
				}
			}
		} // j가 생성자 숫자에 해당되면 다음 j로 넘어가고, 모든 생성자 숫자에 해당되지 않는다면 j를 출력하고 다음 j로 넘어간다.

	}

}
