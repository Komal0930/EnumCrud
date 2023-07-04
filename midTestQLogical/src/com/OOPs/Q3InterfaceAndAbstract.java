package com.OOPs;
interface Drawble
{
	void draw();
}
interface Printable
{
	void print();
}
abstract class Shape {
	abstract void show();
}
class Pictures extends Shape implements Drawble,Printable{

	@Override
	public void print() {
		System.out.println("Print the pictures..");
		
	}

	@Override
	public void draw() {
		System.out.println("Draw the Pictures..");
		
	}

	@Override
	void show() {
		System.out.println("Show Pictures ....");
		
	}
	
}
public class Q3InterfaceAndAbstract {

	public static void main(String[] args) {
		Pictures p=new Pictures();
		p.draw();
		p.print();
		p.show();

	}

}
