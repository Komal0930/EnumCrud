package com.BasicJava;

import java.util.Scanner;

public class Q7UniquePair {
	public static void uniquePair(int arr[], int n)
	{
		int first=arr[0];
		int second=n-arr[0];
		for (int i=0;i<arr.length-1;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				if (arr[i]+arr[j]==n)
				{
					System.out.println(arr[i]+","+arr[j]);
				}
				
			}
			
		}
		//System.out.println(first+" "+second);
		
	}

	public static void main(String[] args) {
		int arr[]= {2,4,3,5,6,-2,4,7,8,9};
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the digit");
       int n=sc.nextInt();
       uniquePair(arr,n);
	}

}
