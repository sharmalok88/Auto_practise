package Assignments;

import java.util.Scanner;

public class table_print {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number whose table you want to print : ");
		int num = s.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			int table = num*i;
			System.out.println(num+" * "+i+" = "+table);
		}
		
		/*int i=1;
		while(i<=10)
		{
			int table = num*i;
			System.out.println(num+" * "+i+" = "+table);
			i++;
		}*/
	}

}
