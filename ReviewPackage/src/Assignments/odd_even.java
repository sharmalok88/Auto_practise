package Assignments;

import java.util.Scanner;

public class odd_even {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number to check if it is odd number or even number : ");
		int num = s.nextInt();
		
		if(num%2==0)
		{
			System.out.println("Entered number is even number");
		}
		else
		{
			System.out.println("Entered number is odd number");
		}

	}

}
