import java.util.*;
public class StringTokenizer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer a = new StringTokenizer("JAVA,PYTHON,C",",");
		while(a.hasMoreTokens()) {
			System.out.println(a.nextToken(","));
		}
	}

}
