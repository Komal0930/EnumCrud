package com.BasicJava;

import java.util.Arrays;
import java.util.Scanner;

public class Q4ReverseArray {
	public static void reverseArray(int arr[])
	{
		System.out.println("Original :"+Arrays.toString(arr));
	  int length=arr.length/2;
	  for (int i=0;i<length;i++)
	  {
		  for (int j=length;j<arr.length;j++)
		  {
			  int temp=arr[i];
			  arr[i]=arr[j];
			  arr[j]=temp;
		  }
	  }
	  
	  
	  System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements");
		for (int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		reverseArray(arr);
	}

}
