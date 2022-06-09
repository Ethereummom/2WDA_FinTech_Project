package majorenglish;

import java.util.Vector;

public class MajorEnglish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(-1);
		v.add(15);
		v.add(5);
		v.add(-1);
		v.add(15);
		v.add(5);
		v.add(-1);
		v.addElement(3);
		System.out.println("Vector Size : " + v.size());
		System.out.println("Vector Capacity : " + v.capacity());
		for (int i = 0; i < v.size(); i++) {
			int n = v.get(i);
			System.out.println(n);
			
		}
		int sum = 0;
		for (int i = 0; i < v.size(); i++) {
			int n = v.elementAt(i);
			sum += n;
			
		}
		System.out.println("Sum of Vector : " + sum);
		
	
	}

}
