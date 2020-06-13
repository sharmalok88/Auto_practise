import java.util.Scanner;

public class child2 extends parentClass {
	
	public child2() {
		System.out.println("Welcome to class child2");
	}
	
	public void div(int a, int b) {
		int c = a/b;
		System.out.println("Value of div is " );
	}

	public static void main(String[] args) {
		child2 ch = new child2();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter value for a : ");
		int x = s.nextInt();
		System.out.println("Enter value for b : ");
		int y = s.nextInt();
		
		ch.mul(x,y);
		ch.div(x,y);
		ch.sum(x,y);
	}

}
