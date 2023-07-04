package com.OOPs;
class Person1{
	long adhar_no=4500830671269l;
	String name="Ram";
	int age=27;
	long mobile_no=776890450l;
	
	public void show()
	{
		System.out.println("Hi this is person class");
	}
}
class Employee extends Person1
{
	int salary=45000;
	String post="Manager";
}
class Manager extends Employee{
	int commision=4500;
	public void show()
	{
		System.out.println("Name is :"+name);
		System.out.println("Adhar no :"+adhar_no);
		System.out.println("Age :"+age);
		System.out.println("Mobile No :"+mobile_no);
		System.out.println("Salary :"+salary);
		System.out.println("Post is :"+post);
		System.out.println("Commision :"+commision);
	}
}
public class Q5InheritancePerson {

	public static void main(String[] args) {
		Manager m=new Manager();
		m.show();

	}

}
