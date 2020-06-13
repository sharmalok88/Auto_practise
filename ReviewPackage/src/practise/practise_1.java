package practise;

import java.util.Scanner;

public class practise_1 {
	int num;
	
	public void fibonacci(int num) {
		int a =0, b =1,c;
		System.out.print("Fibonacci series : "+a+" ");
		System.out.print(b+" ");
		
		for(int i=0;i<num;i++) {
		c = a+b;
		a = b;
		b = c;
		System.out.print(b+" ");
		}
		System.out.println(""+'\n');
	}
	
	public void factorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.print("Factorial of entered number is : "+fact+'\n'+'\n');
	}
	
	public void prime(int num) {
		boolean flag=false;
		for(int i=2;i<=num/2;i++) {
			if(num%i == 0)
			{
				flag=true;
				break;
			}
		}
			if(flag == false)
			{
				System.out.println("Enered number is a prime number");
			}
			else
			{
				System.out.println("Entered number is not a prime number");
			}
			System.out.println("");
	}
	
	public void odd_even(int num) {
		if(num%2 == 0) {
			System.out.println("Entered number is even");
		}
		else
		{
			System.out.println("Entered number is odd");
		}
		System.out.println("");
	}

	public void palindrome(int num) {
		int original_number = num, reverse =0, remainder;
		while(num!=0) {
			remainder = num%10;
			reverse = reverse*10 + remainder;
			num = num/10;
		}
		if(original_number == reverse) {
			System.out.println("Entered number is palindrome");
		}
		else
		{
			System.out.println("Entered number is not a palindrome");
		}
		System.out.println("");
	}
	
	public void armstrong(int num) {
		int original_number = num, remainder,arm=0;
		while(num!=0) {
			remainder = num%10;
			arm = arm + remainder*remainder*remainder;
			num = num/10;
		}
		if(original_number == arm)
		{
			System.out.println("Entered number is armstrong");
		}
		else
		{
			System.out.println("Entered number is not an armstrong");
		}
		System.out.println("");
	}
	
	public void SwapWithoutThirdVariable(int a, int b) {
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After swapping value of a : "+a);
		System.out.println("After swapping value of b : "+b);
		System.out.println("");
	}
	
	public void SwapusingThirdVariable(int a, int b) {
		int c;
		c = a;
		a = b;
		b = c;
		System.out.println("After swapping value of a : "+a);
		System.out.println("After swapping value of b : "+b);
		System.out.println("");
	}
	
	public void table(int num) {
		for(int i=1;i<=10;i++) {
			int c = num*i;
			System.out.println(num+" * "+i+" = "+c);
		}
	}
	public static void main(String[] args) {

		practise_1 ref = new practise_1();
		Scanner s = new Scanner(System.in);
		System.out.println("****************FIBONACCI SERIES************************");
		System.out.print("Enter a number tO print fibonacci series : ");
		int value = s.nextInt();
		ref.fibonacci(value);
		
		System.out.println("********************FACTORIAL**************************");
		System.out.print("Enter a number to get factorial : ");
		int fact = s.nextInt();
		ref.factorial(fact);
		
		System.out.println("********************PRIME OR NOT**************************");
		System.out.print("Enter a number to check if it is prime or not : ");
		int prime = s.nextInt();
		ref.prime(prime);

		System.out.println("********************ODD OR EVEN**************************");
		System.out.print("Enter a number to check if it is odd or even : ");
		int random_num = s.nextInt();
		ref.odd_even(random_num);
		
		System.out.println("********************PALINDROME***************************");
		System.out.print("Enter a number to check if it is palindrome or not : ");
		int palin = s.nextInt();
		ref.palindrome(palin);
		
		System.out.println("********************ARMSTRONG***************************");
		System.out.print("Enter a number to check if it is armstrong or not : ");
		int num = s.nextInt();
		ref.armstrong(num);
		
		System.out.println("******SWAP WITHOUT USING THIRD VARIABLE*****************");
		System.out.print("Enter a value of a : ");
		int a = s.nextInt();
		System.out.print("Enter a value of b : ");
		int b = s.nextInt();
		ref.SwapWithoutThirdVariable(a, b);
		
		System.out.println("**********SWAP USING THIRD VARIABLE*********************");
		System.out.print("Enter a value of x : ");
		int x = s.nextInt();
		System.out.print("Enter a value of y : ");
		int y = s.nextInt();
		ref.SwapusingThirdVariable(x, y);
		
		System.out.println("**********************TABLE*****************************");
		System.out.print("Enter a number to print it's table : ");
		int tab = s.nextInt();
		ref.table(tab);
	}

}
