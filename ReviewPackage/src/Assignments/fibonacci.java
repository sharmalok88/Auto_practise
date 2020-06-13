package Assignments;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a = 0;
		int b = 1;
		int num = s.nextInt();
		System.out.println("*****************");
		System.out.println(a);
		System.out.println(b);
		int c;
		
		for(int i=2;i<num;i++)
		{
			c = a+b;
			a = b;
			b = c;
			System.out.println(b);
		}

	}

}
