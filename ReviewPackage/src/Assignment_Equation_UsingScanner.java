import java.util.Scanner;
public class Assignment_Equation_UsingScanner {
	
	public int sum(int a, int b){
		int c = a+b;
		System.out.println("Value for sum :"+c+" \n");
		return c;
		}
	public int sub(int a, int b){
		int d = a-b;
		System.out.println("Value for sub :"+d+" \n");
		return d;
	}
	public int mul(int a, int b){
		int e = a*b;
		System.out.println("Value for mul :"+e+" \n");
		return e;
	}
	public void divison(int a, int b){
		int f = a/b;
		System.out.println("Result of equation is :" + f);
	}
	public static void main(String[] args) {	// ((((x1+x2)-x3)+x4)*x5)/x6)
		Assignment_Equation_UsingScanner ref = new Assignment_Equation_UsingScanner();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value for X : ");
		int x = s.nextInt();
		System.out.println("Enter value for Y : ");
		int y = s.nextInt();
		int sum = ref.sum(x, y);
		System.out.println("Enter value for Y1 : ");
		int y1 = s.nextInt();
		int sub = ref.sub(sum, y1);
		System.out.println("Enter value for Y1 : ");
		int y2 = s.nextInt();
		int sum2 = ref.sum(sub, y2);
		System.out.println("Enter value for Y3 : ");
		int y3 = s.nextInt();
		int mul = ref.mul(sum2, 3);
		System.out.println("Enter value for Y4 : ");
		int y4 = s.nextInt();
		ref.divison(mul, y4);		
}}
