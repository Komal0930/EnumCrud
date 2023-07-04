package com.OOPs;
interface Vehicles
{
	void Name();
	default void run()
	{
		System.out.println("Vehicles is running");
	}
	static void stop()
	{
		System.out.println("Stop..........");
	}
}
public class Q1Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
