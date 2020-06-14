package Assignments;
import java.util.Scanner;

public class pattern_Assignment {
	
	public void RightAngleTriangle(int x)
	{
		for(int i=1;i<=x;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void OppRightAngleTriangle(int x)
	{
		for(int i=1;i<=x;i++)
		{
			for(int j=x;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void NumberRightAngleTriangle(int x)
	{
		for(int i=1;i<=x;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public void FloydTriangle(int x)
	{
		int num=1;
		for(int i=1;i<=x;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
	
	public void LeftAngleTriangle(int x)
	{
		for(int i=1;i<=x;i++)
		{
			for(int j=x;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void Triangle(int x)
	{
		for(int i=1;i<=x;i++)
		{
			for(int j=x;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=-i;k<i-1;k++)
			{
				System.out.print("*");
			}System.out.println();
		}
	}
	
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number of rows to print a pattern : ");
		int x = s.nextInt();
		
		pattern_Assignment ref= new pattern_Assignment();
		ref.RightAngleTriangle(x);
		System.out.println();
		ref.OppRightAngleTriangle(x);
		System.out.println();
		ref.NumberRightAngleTriangle(x);
		System.out.println();
		ref.FloydTriangle(x);
		System.out.println();
		ref.LeftAngleTriangle(x);
		System.out.println();
		ref.Triangle(x);
	}

}
