import java.util.*;
public class daTe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		System.out.println(d);
		System.out.println(1900 + d.getYear());
		System.out.println(d.getMonth()+1);
		System.out.println(d.getDate());
		
		d.setHours(12);
		d.setMinutes(34);
		d.setSeconds(0);
		System.out.println(d);
		
		
		Calendar a = Calendar.getInstance();
		System.out.println(a);
		System.out.println(a.get(Calendar.YEAR)+"년");
		System.out.println(a.get(Calendar.MONTH)+1 + "월");
		System.out.println(a.get(Calendar.DATE)+"일");
		
		a.set(Calendar.HOUR,12);
		a.set(Calendar.MINUTE,34);
		a.set(Calendar.SECOND,0);
		System.out.println(a);
		

	}

}
