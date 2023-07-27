package Arrays;
import java.sql.Array;
import java.util.*;
import java.util.Scanner;

public class ArrayReverse {
	public static void reverse(int a[])
	{
		int length=a.length;
			int result[] =new int[length];
			int c=0;
			
			for (int i=(length)/2;i<length;i++)
			{
				
				result[c]=a[i];
				c++;
				
			}
			for (int i=0;i<length/2;i++)
			{
				result[c]=a[i];
				c++;
			}
			System.out.println(Arrays.toString(result));
		
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int s=sc.nextInt();
		int a[]=new int[s];
		System.out.println("Enter array element..");
		for (int i=0;i<s;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
    reverse(a);
	}

}
