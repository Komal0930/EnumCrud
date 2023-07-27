package com.Map;
import java.util.*;
import java.util.Map.Entry;
class Dept
{
	public int did;
	public String dname;
	public Dept(int did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
	}
	@Override
	public String toString() {
		return "Dept [did=" + did + ", dname=" + dname + "]";
	}
	
}
class Employee implements Comparable<Employee>
{
	public int eid;
	public String name;
	public int salary;
	public Dept d;
	public Employee(int eid, String name, int salary, Dept d) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		this.d = d;
		
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + ", d=" + d +"]";
	}
	@Override
	public int compareTo(Employee o) {
		if (this.d.dname.equalsIgnoreCase(o.d.dname))
		{
		return o.salary-this.salary ;
		}
		else
		{
			return o.d.dname.compareToIgnoreCase(this.d.dname);
		}
	}
	
	
	
}
public class Q6HashMap {

	public static void main(String[] args) {
		Dept d1=new Dept(101,"HR");
		Dept d2=new Dept(102,"Admin");
		Dept d3=new Dept(103,"Finance");
		Employee e1=new Employee(1,"Ram",45000,d1);
		Employee e2=new Employee(2,"Neha",56000,d2);
		Employee e3=new Employee(3,"Priya",34000,d3);
		Employee e4=new Employee(4,"Nikita",25600,d2);
		Employee e5=new Employee(5,"Rohit",30000,d3);
	
		
		HashMap<Employee, String>tm=new  HashMap<>();
		tm.put(e1,"Pune");
		tm.put(e2,"Mumbai");
		tm.put(e3,"nashik");
		tm.put(e5, "Nagpur");
		tm.put(e4, "Nashik");
		Set s=tm.entrySet();
		Iterator<Map.Entry<Employee, String>> it=s.iterator();
		while(it.hasNext())
		{
			Entry<Employee, String> e= it.next();
		     System.out.println(e);
			
		}
		System.out.println("........................................");
        TreeMap<Employee, String> tm1=new TreeMap<>();
        tm1.putAll(tm);
        
       for (Map.Entry<Employee, String> m :tm1.entrySet() )
       {
    	   System.out.println(m.getKey()+" "+m.getValue());
       }
		
		

	}

}
