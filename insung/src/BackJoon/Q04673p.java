package BackJoon;

public class Q04673p {
	public static void main(String args[]) {
		/*
		 * int temp = 1; boolean arr[] = new boolean[10001];
		 * 
		 * for (int i = 1; i < 10001; i++) { if (temp < 10001) arr[temp] = true; if (i %
		 * 10 == 0) temp -= 7; else temp += 2;
		 * 
		 * }
		 * 
		 * for (int i = 1; i < arr.length; i++) { if (!arr[i]) System.out.println(i); }
		 * } }
		 */
		int sum = 0;
		int[] numbers = new int[10001];
		for (int i = 0; i <= 10000; i++) {
			String change = Integer.toString(i); // �Ű����� i�� ���ڿ��� ����
			int stringlength = change.length(); // ~~.length() ���ڿ��� ���̸� ��ȯ
			for (int j = 0; j < stringlength; j++) {
				char num = change.charAt(j); // ���ڿ� change���� j��° index ����
				sum += (int) num - '0'; // ������ num�� ���������� ����ȯ �� sum = sum + num
			}
			sum += i;
			numbers[i] = sum;// n[4577] = 4600
			sum = 0;
		} // ������ ���ڸ� �迭 numbers�� �ִ´�.
		
		for (int i = 1; i <= 10000; i++) {
//			System.out.print(i + " " + numbers[i] + "\n");
			for (int e : numbers) {
				if (e == numbers[i]) {
					System.out.println(i);
					break;
				}
//				if (i == e) {
//					break;
//				}
			}
		} // j�� ������ ���ڿ� �ش�Ǹ� ���� j�� �Ѿ��, ��� ������ ���ڿ� �ش���� �ʴ´ٸ� j�� ����ϰ� ���� j�� �Ѿ��.
	}
}