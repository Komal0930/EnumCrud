package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AlternateElementFromTwoArray {
	public static void alternate(int a[], int b[])
	{
		int l=a.length+b.length;
		int c[]=new int[l];
		int count=0;
		for (int i=0,j=0;i<a.length&&j<b.length;i++,j++)
		{
			
			c[count]=a[i];
			count++;
			
			c[count]=b[i];
			count++;
			
		}
		
		
		System.out.println(Arrays.toString(c));
	}

	public static void main(String[] args) {
		int a1[]=new int [5];
		int a2[]=new int[6];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st array Element");
		for (int i=0;i<a1.length;i++)
		{
			a1[i]=sc.nextInt();
		}
		
		System.out.println("Enter 2nd array element");
		for (int i=0;i<a2.length;i++)
		{
			a2[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
alternate(a1,a2);
	}

}
