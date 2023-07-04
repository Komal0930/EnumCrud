package com.OOPs;

public class Q1MainMethod {

	public static void main(String[] args) {
		System.out.println("Car class...");
		Vehicles v=new Car();
		v.run();
		v.Name();
		Vehicles.stop();
		
		System.out.println("Bus class....");
		Vehicles v1=new Bus();
		v1.run();
		v1.Name();
		Vehicles.stop();
		
		System.out.println("Train class....");
		Vehicles v2=new Train();
		v2.run();
        v2.Name();
        Vehicles.stop();
	}

}
