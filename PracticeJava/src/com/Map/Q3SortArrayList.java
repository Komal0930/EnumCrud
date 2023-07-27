package com.Map;
import java.util.*;
public class Q3SortArrayList {

	public static void main(String[] args) {
		Dept d1=new Dept(101,"HR");
		Dept d2=new Dept(102,"Admin");
		Dept d3=new Dept(103,"Finance");
		Employee e1=new Employee(1,"Ram",45000,d1);
		Employee e2=new Employee(2,"Neha",56000,d2);
		Employee e3=new Employee(3,"Priya",34000,d3);
		Employee e4=new Employee(4,"Nikita",25600,d2);
		Employee e5=new Employee(5,"Rohit",30000,d3);
		Employee e6=new Employee(6,"Priti",35000,d1);
		ArrayList<Employee>al=new ArrayList<>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		al.add(e6);
		
		Iterator<Employee>it=al.iterator();
		while(it.hasNext())
		{
			Employee e=it.next();
			System.out.println(e);
		}
		Collections.sort(al, new MyCom());
		System.out.println(".........................................");
		Iterator<Employee>itr=al.iterator();
		while(itr.hasNext())
		{
			Employee e=itr.next();
			System.out.println(e);
		}

	}
	

}
class MyCom implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o2.salary-o1.salary;
	}
	
}
