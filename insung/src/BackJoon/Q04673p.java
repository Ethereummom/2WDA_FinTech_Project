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
			String change = Integer.toString(i); // 매개변수 i를 문자열로 변경
			int stringlength = change.length(); // ~~.length() 문자열의 길이를 반환
			for (int j = 0; j < stringlength; j++) {
				char num = change.charAt(j); // 문자열 change에서 j번째 index 추출
				sum += (int) num - '0'; // 문자형 num을 숫자형으로 형변환 후 sum = sum + num
			}
			sum += i;
			numbers[i] = sum;// n[4577] = 4600
			sum = 0;
		} // 생성자 숫자를 배열 numbers에 넣는다.
		
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
		} // j가 생성자 숫자에 해당되면 다음 j로 넘어가고, 모든 생성자 숫자에 해당되지 않는다면 j를 출력하고 다음 j로 넘어간다.
	}
}