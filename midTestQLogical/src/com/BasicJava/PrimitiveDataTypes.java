package com.BasicJava;

public class PrimitiveDataTypes {

	public static void main(String[] args) {
		// byte
		byte b=50;
		Byte c=new Byte(b);
		Byte b1=new Byte("45");
		System.out.println("Value of b :"+b);
		System.out.println("Value of c :"+c);
		System.out.println("Value of b1 :"+b1);

		// int 
		int i=45;
		Integer i1=new Integer(i);
		Integer i2=new Integer("8");
		System.out.println(i+" "+i1+" "+i2);
		
		//float
		float f=4.5f;
		Float f1=new Float(f);
		Float f2=new Float("8.9f");
		System.out.println(f+" "+f1+" "+f2);
		
		// long
		long l=93452647634l;
		Long l1=new Long(l);
		Long l2=new Long("72764523165");
		System.out.println(l+" "+l1+" "+l2);
		
		// double 
		double d=4.533333333;
		Double d1=new Double(d);
		Double d2=new Double("6.9731543");
		System.out.println(d+" "+d1+" "+d2);
		
		//boolean 
		boolean e=false;
		Boolean e1=new Boolean(e);
		Boolean e2=new Boolean("True");
		System.out.println(e+" "+e1+" "+e2);
		
		// character
		char ch='a';
		char ch1='A';
		Character ch2=new Character(ch);
		Character ch3=new Character('h');
		System.out.println(ch+" "+ch1+" "+ch2+" "+ch3);
		
		
	}

}
