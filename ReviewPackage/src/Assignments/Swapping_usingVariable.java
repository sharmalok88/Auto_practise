//****** Swapping of two numbers using third variable*********
package Assignments;

import java.util.Scanner;

public class Swapping_usingVariable {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter value of a : ");
		int a = s.nextInt();
		
		System.out.println("Enter value of b : ");
		int b = s.nextInt();
		System.out.println("*******************************************");
		System.out.println("Original Values of 'a' is : "+a);
		System.out.println("Original Values of 'b' is : "+b);
		int temp;
		System.out.println("*******************************************");
		temp = a;
		a=b;
		b = temp;
		System.out.println("After Swapping Values of 'a' is : "+a);
		System.out.println("After Swapping Values of 'b' is : "+b);
		
		
		
	}

}
