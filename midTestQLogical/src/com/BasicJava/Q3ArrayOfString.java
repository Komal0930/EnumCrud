package com.BasicJava;
import java.util.*;
class Employee implements Comparable<Employee>
{
	int eid;
	String ename;
	int esalary;
	public Employee(int eid, String ename, int esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
	}
	@Override
	public int compareTo(Employee o) {
		
		return o.esalary-this.esalary;
	}
	
}
public class Q3ArrayOfString {
	
	public static void main(String[] args) {
		LinkedList<Employee>emp=new LinkedList<>();
		emp.add(new Employee(101,"Neha",50000));
		emp.add(new Employee(136,"Raj",70000));
		emp.add(new Employee(106,"Nikita",36500));
		emp.add(new Employee(108,"amit",45900));
		
		Collections.sort(emp);
		
		//System.out.println(Arrays.toString(emp));
		for (Employee e:emp)
		{
			System.out.println(e);
		}
		
		
		

	}

}
