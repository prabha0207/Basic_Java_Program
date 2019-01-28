import java.util.*;
import java.lang.*;
import java.io.*;
class ImporvedInputConstraints
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[10];
		for (int i = 0; i < n; i++)
		{
			a[i] = s.nextInt();
		}
		
		for (int i=0;i<n;i++)
		{
			for (int j=i+1;j<n;j++)
			{
				if (a[i] > a[j])
				{
					int t;
					t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
	     	for (int i = 0; i < n; i++)
		{
			System.out.println(a[i]);
		}
	}
}
