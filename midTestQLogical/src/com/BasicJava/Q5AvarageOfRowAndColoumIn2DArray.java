package com.BasicJava;

public class Q5AvarageOfRowAndColoumIn2DArray {
	public static void avarageRow(int a[][])
	{
		System.out.println("Row wise sum");
		for(int i=0;i<a.length;i++)
		{
			float sum=0;
			float avr=0;
			for (int j=0;j<a[i].length;j++)
			{
				sum=sum+a[i][j];
				avr=sum/a[i].length;
			}
			
			System.out.print(" SUM :"+sum);
			System.out.print(" Average :"+avr+" ");
			System.out.println();
		}
		
		
	}
	public static void avarageColoum(int a[][])
	{
		System.out.println("Coloum wise sum");
		for(int i=0;i<a[0].length;i++)
		{
			float sum=0;
			float avr=0;
			for (int j=0;j<a.length;j++)
			{
				sum=sum+a[j][i];
				avr=sum/a[j].length;
			}
			
			System.out.print(" SUM :"+sum);
			System.out.print(" Average :"+avr+" ");
			System.out.println();
		}
		
		
	}

	public static void main(String[] args) {
     int a[][]= {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
     
     for (int x[]:a)
     {
    	 for (int e:x)
    	 {
    		 System.out.print(e+" ");
    	 }
    	 System.out.println();
     }
     avarageRow(a);
     avarageColoum(a);
	}

}
