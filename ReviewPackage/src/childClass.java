import java.util.Scanner;

public class childClass extends parentClass {

	public childClass() {
		System.out.println("Welcome to child Class");
	}
	
	public void sub(int a , int b) {
		int c = a-b;
		System.out.println("value of sub :"+c);
	}
	
	public static void main(String[] args) {
		
		childClass child = new childClass();
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter value for a : ");
		int x = s.nextInt();
		System.out.println("Enter value for b : ");
		int y = s.nextInt();
		
		child.mul(x,y);
		child.sub(x,y);
		child.sum(x,y);
		
	}

}
