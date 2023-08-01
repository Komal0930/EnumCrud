package com.EnumDemo;
// old method to create enum before jdk 1.5 version
class Directions
{
	static final String NORTH="NORTH";
	static final String SOUNTH="SOUTH";
	static final String EAST="EAST";
	static final String WEST="WEST";
}
public class EnumDemo1 {
	// after 1.8 
	//enum creation
	public  enum Direction {NORTH,SOUTH,EAST,WEST};

	public static void main(String[] args) {
		Direction d1=Direction.NORTH;
		Direction d2=Direction.NORTH;
		if (d1.equals(d2))
		{
			System.out.println("Equals...");
		}
		System.out.println(".................................");
		// traverse 
		for (Direction d: Direction.values())
		{
			System.out.println(d);
		}
		
		System.out.println("......................................");
		// ordinal number : return index of enum value
		// index starts from 0
		System.out.println(Direction.SOUTH.ordinal());
		
			
		

	}

}
