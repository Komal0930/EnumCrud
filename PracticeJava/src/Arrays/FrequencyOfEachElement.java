package Arrays;
import java.util.*;
public class FrequencyOfEachElement {
	public static void frequency(int a[])
	{
		int count=1;
		for (int i=0;i<a.length;i++)
		{
			count=1;
			boolean isvisited=false;
			for (int k=i-1;k>=0;k--)
			{
				if (a[i]==a[k])
				{
					isvisited=true;
					break;
				}
			}
			if (isvisited==false)
			{
				for (int j=i+1;j<a.length;j++)
				{
					if (a[i]==a[j])
					{
						count++;
					}
				}
				System.out.println(a[i]+" "+count);
			}
		}
	}

	public static void main(String[] args) {
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array element");
		for (int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
frequency(a);
	}

}
