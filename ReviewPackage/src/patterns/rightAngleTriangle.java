package patterns;

import java.util.Scanner;

public class rightAngleTriangle {
	
	public void triangle(int a)
	{
		System.out.println("********************** Trianlge **********************");
		for(int i=1;i<=a;i++)
		{
			for(int j=a;j>=i;j--)
			{
				System.out.print(" ");
			}
			

			for(int k=-i;k<i-1;k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	public void rightAngleTriangle(int a)
	{
		System.out.println("********************* Right Angle Trianlge *********************");
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void leftAngleTriangle(int a)
	{
		System.out.println("********************* Left Angle Trianlge *********************");
		for(int i=1;i<=a;i++)
		{
			for(int j=a;j>=i;j--)
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


	public void oppRightAngleTriangle(int a)
	{
		System.out.println("****************** Opposite Right Angle Trianlge ******************");
		for(int i=1;i<=a;i++)
		{
			for(int j=a;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		rightAngleTriangle ref = new rightAngleTriangle();
		Scanner s = new Scanner(System.in);
		System.out.print("Enter any number to make triangle shapes : ");
		int x = s.nextInt();
		ref.leftAngleTriangle(x);
		System.out.println();
		ref.rightAngleTriangle(x);
		System.out.println();
		ref.triangle(x);
		System.out.println();
		ref.oppRightAngleTriangle(x);

	}

}
