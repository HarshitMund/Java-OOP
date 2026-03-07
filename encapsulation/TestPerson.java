package encapsulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {

	public static void main(String[] args) throws ParseException {
		
		Person p1 = new Person();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d1 = sdf.parse("06/02/2002");
		
		p1.setname("Harshit Mund");
		p1.setDob(d1);
		p1.setAddress("Odisha");
		
		System.out.println(p1.getName());
		System.out.println(p1.getDob());
		System.out.println(p1.getAddress());
		
		System.out.println("-----------------------------------");
		
		Person p2 = new Person();
		
		Date d2 = sdf.parse("17/11/1996");
		
		p2.setname("Siddhanta Hota");
		p2.setDob(d2);
		p2.setAddress("Pune");
		
		System.out.println(p2.getName());
		System.out.println(p2.getDob());
		System.out.println(p2.getAddress());

	}

}
