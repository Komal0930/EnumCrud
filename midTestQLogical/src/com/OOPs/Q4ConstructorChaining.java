package com.OOPs;

import java.util.Scanner;

class Person
{
	long adhar_no;
	String name;
	int age;
	long mobile_no;
	public Person()
	{
		System.out.println("Hi this is Person information");
	}
	public Person(long adhar_no, String name, int age, long mobile_no) {
		this();
		this.adhar_no = adhar_no;
		this.name = name;
		this.age = age;
		this.mobile_no = mobile_no;
	}
	@Override
	public String toString() {
		return "Person [adhar_no=" + adhar_no + ", name=" + name + ", age=" + age + ", mobile_no=" + mobile_no + "]";
	}
	
}
public class Q4ConstructorChaining {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Person per[]=new Person[3];
		for (int i=0;i<per.length;i++)
		{
		System.out.println("Enter the person details..");
		System.out.println("Enter adhar card no.");
		long ano=sc.nextLong();
		System.out.println("Enter the name of person");
		String name=sc.next();
		System.out.println("Enter the age of person");
		int age=sc.nextInt();
		System.out.println("Enter mobile no");
		long mno=sc.nextLong();
		
		per[i]=new Person(ano,name,age,mno);
		
		}
	
		for (Person pt:per)
		{
			System.out.println(pt);
		}

	}

}
