package hackerrank;
import java.io.*;
import java.util.*;
public class AngryProfessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=in.nextInt();
		System.out.println("Enter the 'k' value");
		int k=in.nextInt();
		System.out.println("Enter the students timing");
		int a[]=new int[n];
		int i;
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		int count=0;
		for(i=0;i<n;i++)
		{
			if(a[i]<=0)
			{
				count++;
			}
		}
		if(k<=count)
		{
			System.out.println("NO");
		}else
		{
			System.out.println("Yes");
		}
		System.out.println("total student on time"+count);
	}

}
