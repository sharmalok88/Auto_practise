package inheritance;

import java.util.Scanner;

public class child extends parent {

	public child() {
		System.out.println("Welcome to child class");
	}
	
	public void totalSum(int a, float b, char c) {
		int d = a+(int)b+c;
		System.out.println(" Implicit & Explicit Conversion - Total Sum is : "+d);
	}
	
	public static void main(String[] args) {
		child ch = new child();
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Integer value for a : ");
		int x = s.nextInt();
		System.out.println("Enter Float value for b : ");
		float y = s.nextFloat();
		System.out.println("Enter Character value for c : ");
		char z = s.next().charAt(0);
		
		int sum1 = ch.sumInt(x, y);
		System.out.println("******** sum1 ********* : "+sum1);
		float sum2 = ch.sumFloat(x, y);
		System.out.println("******** sum2 ********* : "+sum2);
		int psum = ch.parentsum(sum1, sum2, z);
		System.out.println("******** psum ********* : "+psum);
		ch.totalSum(psum, sum2, z);
	}

}