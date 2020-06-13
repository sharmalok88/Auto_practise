package Assignments;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter number to check palindrome : ");
		int num = s.nextInt();
		int remainder;
		int reverse = 0;
		int original = num;

		while(num!=0)
		{
			remainder = num%10;
			//System.out.println("remainder : "+remainder);
			reverse = reverse * 10 + remainder;
			//System.out.println("reverse : "+reverse);
			num = num/10;
			//System.out.println("num : "+num);
		
		}
		System.out.println("reverse number is : "+reverse);
		System.out.println("original number is : "+original);
		
		if(original == reverse)
		{
			System.out.println("Number you have entered is a palindrome number");
		}
		else
		{
			System.out.println("Number you have entered is not a palindrome number");
		}

	}

}
