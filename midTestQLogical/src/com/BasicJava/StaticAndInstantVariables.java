package com.BasicJava;
class Variables{
	// Static Variables
	static int num1=10;
	public void takeInput()
	{
		num1=300;
		System.out.println(num1);
	}
	//instance variables
	int id ;
	String name;
	public void AcceptData(int sid,String sname)
	{
		id=sid;
		name=sname;
	}
	public void Display()
	{
		System.out.println(id+"  "+name);
	}
}
public class StaticAndInstantVariables {
	
	public static void main(String[] args) {
		//System.out.println(num1);
		// call for static variables
		System.out.println(Variables.num1);
		Variables v=new Variables();
		v.takeInput(); 
		
		// instance variables
		
		v.AcceptData(102, "Divya");
		v.Display();
		
	   
		

	}

}
