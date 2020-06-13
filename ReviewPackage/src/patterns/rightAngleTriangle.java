package patterns;

public class rightAngleTriangle {
	
	public void triangle()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
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
	
	public void rightAngleTriangle()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void leftAngleTriangle()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
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


	public void oppRightAngleTriangle()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		rightAngleTriangle ref = new rightAngleTriangle();
		ref.leftAngleTriangle();
		System.out.println("***************************************");
		ref.rightAngleTriangle();
		System.out.println("***************************************");
		ref.triangle();
		System.out.println("***************************************");
		ref.oppRightAngleTriangle();

	}

}
