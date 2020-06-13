package Assignments;

public class Prime_Number {

	public static void main(String[] args) {
		
		int num = 17;
		System.out.println("Checking if num "+num+" is prime or not");
		System.out.println("******************************************");
		
		boolean flag = false;
		
		for(int i=2;i<=num/2;i++)
		{
			if(num%i == 0)
			{
				System.out.println("NON Prime Number ");
				flag =true;
				break;
			}
		}
		if(flag == false)
		{
			System.out.println("Number is Prime number");
		}
		else
		{
			System.out.println("Number is not a prime number");
		}

	}

}
