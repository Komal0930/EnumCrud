package com.OOPs;

import java.util.Scanner;

class Watchman{
	String name;
	int age;
	String experience;
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getExperience() {
		return experience;
	}
	
}
class Building {
	int Sr_no;
	String bname;
	int no_of_flats;
	String landmark;
	Watchman w;
	public void setSr_no(int sr_no) {
		Sr_no = sr_no;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public void setNo_of_flats(int no_of_flats) {
		this.no_of_flats = no_of_flats;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public void setW(Watchman w) {
		this.w = w;
	}
	public int getSr_no() {
		return Sr_no;
	}
	public String getBname() {
		return bname;
	}
	public int getNo_of_flats() {
		return no_of_flats;
	}
	public String getLandmark() {
		return landmark;
	}
	public Watchman getW() {
		return w;
	}
	
		
}
public class Q6BuildingClass {

	public static void main(String[] args) {
		Building b=new Building();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter details.");
	for (int i=0;i<2;i++)
	{
		System.out.println("Enter building name");
		String bname=sc.next();
		System.out.println("Enter Serial No");
		int sno=sc.nextInt();
		System.out.println("Enter no of flats");
		int f=sc.nextInt();
		System.out.println("Enter Landmark");
		String l=sc.next();
		System.out.println("Enter watchman name");
		String wname=sc.next();
		System.out.println("Enter age of watchman");
		int age=sc.nextInt();
		System.out.println("Enter experience of watchman");
		String ex=sc.next();
		
		b.setSr_no(sno);
		b.setBname(bname);
		b.setNo_of_flats(f);
        b.setLandmark(l);
        b.setW(new Watchman());
        b.getW().setName(wname);
        b.getW().setAge(age);
        b.getW().setExperience(ex);
		
	}
	
	
	for (int i=0;i<2;i++)
	{
		System.out.println(b.getSr_no()+" "+b.getBname()+" "+b.getNo_of_flats()+" "+b.getLandmark());
	    System.out.println("Watchman Details....");
	    System.out.println(b.getW().getName()+" "+b.getW().getAge()+" "+b.getW().getExperience());
	}

	}

}
