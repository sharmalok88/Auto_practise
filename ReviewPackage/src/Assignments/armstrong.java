package Assignments;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number to check if this number is armstrong number : ");
		int num = s.nextInt();
		int remainder,i=0;
		int original = num;
		
		while(num!=0)
		{
			remainder = num%10;
			//System.out.println("remainder : "+remainder);
			num = num/10;
			//System.out.println("num : "+num);
			i = i+(remainder*remainder*remainder);
			//System.out.println("i : "+i);
		}
		
		if(original == i)
		{
			System.out.println("Number you have enterd is armstrong number");
		}
		else
		{
			System.out.println("Number you have entered is not a armstrong number");
		}

	}

}
