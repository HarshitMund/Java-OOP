package Inheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {

	public static void main(String[] args) throws ParseException {

		System.out.println("---------------------------------------");
		
		System.out.println("BUSINESSMAN");
		Businessman b = new Businessman();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d1 = sdf.parse("12/10/2001");
		
		b.setName("Aman");
		b.setAddress("Bargarh");
		b.setDateOfBirth(d1);
		b.setIncome(50000.00);
		
		System.out.println("Businessman name is: " + b.getName());
		System.out.println("Businessman address is: " + b.getAddress());
		System.out.println("Businessman dob is: " + sdf.format(b.getDateOfBirth()));
		System.out.println("Businessman income is: " + b.getIncome());
		
		System.out.println("---------------------------------------");
		
		System.out.println("DOCTOR");
		
		Doctor d = new Doctor();
		Date d2 = sdf.parse("21/06/1996");
		
		d.setName("Pratish");
		d.setAddress("Bhubaneswer");
		d.setDateOfBirth(d2);
		d.setRegistrationNo("dsf21345657");
		
		System.out.println("Doctor name is: " + d.getName());
		System.out.println("Doctor address is: " + d.getAddress());
		System.out.println("Doctor dob is: " + (sdf.format(d.getDateOfBirth())));
		System.out.println("Doctor registration no is: " + d.getRegistrationNo());
		
		System.out.println("---------------------------------------");
		
		System.out.println("STUDENT");
		Student s = new Student();
		Date d3 = sdf.parse("28/03/2009");
		
		s.setName("Khushi");
		s.setAddress("Nuapada");
		s.setDateOfBirth(d3);
		s.setRollNo("4331456");
		s.setMake(80);
		
		System.out.println("Student name is: " + s.getName());
		System.out.println("Student address is: " + s.getAddress());
		System.out.println("Student dob is: " + (sdf.format(s.getDateOfBirth())));
		System.out.println("Student roll no is: " + s.getRollNo());
		System.out.println("Student mark is: " + s.getMark());
		
	}

}
