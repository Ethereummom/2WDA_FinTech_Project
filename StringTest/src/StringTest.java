
public class StringTest {

	public static void main(String[] args) {
		String proverb = "A barking dog";
		String s1, s2, s3, s4, s5, s8, s9;
		char s7;
		int s6;
		boolean s10;
		
		System.out.println("문자열의 길이 = " + proverb.length());
		
		s1 = proverb.concat((" never Bites!"));
		s2 = proverb.replace('B','b');
		s3 = proverb.substring(2,5);
		s4 = proverb.toUpperCase();
		s5 = proverb.toLowerCase();
		s6 = proverb.length();
		s7 = proverb.charAt(2);
		s10 = proverb.isEmpty();
		
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s6);
		System.out.println(s5);
		System.out.println(s10);
		System.out.println(s7);
		
		
		
		// TODO Auto-generated method stub

	}

}
