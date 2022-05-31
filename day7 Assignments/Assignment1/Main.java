package com.Assignment1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Manager m= new Manager();
		m.setAddress("Lucknow");
		m.setAge(25);
		m.setName("ABC");
		m.setPhoneNo("02101-343434");
		m.setSalary(50000);
		m.setDepartment("HR");
		m.setSpecialisation("MBA in HR");
		
		
	   Employee e = new Employee();
	   e.setAddress("Delhi");
	   e.setAge(23);
	   e.setName("XYZ");
	   e.setPhoneNo("02101-674574");
	   e.setSalary(40000);
	   e.setDepartment("IT");
	   e.setSpecialisation("B.Tech in I.T");
	   
	   System.out.println("Manager Details******* ");
	   System.out.println("Name:"+m.getName());
	   System.out.println("Age:"+m.getAge());
	   System.out.println("Address:"+m.getAddress());
	   System.out.println("Phone No:"+m.getPhoneNo());
	   System.out.println("Department:"+m.getDepartment());
	   System.out.println("Specialization:"+m.getSpecialisation());
	   m.printSalary();
	   
	   System.out.println("----------------------------------------");
	   System.out.println("Employee Details*****");
	   System.out.println("Name:"+e.getName());
	   System.out.println("Age:"+e.getAge());
	   System.out.println("Address:"+e.getAddress());
	   System.out.println("Phone No:"+e.getPhoneNo());
	   System.out.println("Department:"+e.getDepartment());
	   System.out.println("Specialization:"+e.getSpecialisation());
	   m.printSalary();
	}

}
