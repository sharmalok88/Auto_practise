//****** Swapping of two numbers without using third variable*********
package Assignments;

import java.util.Scanner;

public class Swapping_withoutVariable {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter vaue of variable a : ");
		int a = s.nextInt();
		System.out.println("Enter vaue of variable b : ");
		int b = s.nextInt();
		System.out.println("**************************************************");
		System.out.println("Original Value of a is : "+a);
		System.out.println("Original Value of b is : "+b);
		System.out.println("**************************************************");		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After swapping Value of a is : "+a);
		System.out.println("After swapping Value of b is : "+b);
		

	}

}
