
public class ArithmaticAssignment_2 {
	// ((((10/2)+2)-2)-2)*2)

	public int div(int a, int b) {
		int c= a/b;
		System.out.println("Divide is :"+c);
		return c;
	}
	
	public int sum(int a, int b) {
		int d= a+b;
		System.out.println("Sum is :"+d);
		return d;
	}
	
	public int sub(int a, int b) {
		int e= a-b;
		System.out.println("Subtract is :"+e);
		return e;
	}
	
	public void mul(int a, int b) {
		int f= a*b;
		System.out.println("Answer is :"+f);
	}

	public static void main(String[] args) {
		ArithmaticAssignment_2 arith = new ArithmaticAssignment_2();
		int div = arith.div(10, 2);
		int sum = arith.sum(div, 2);
		int sub_1 = arith.sub(sum, 2);
		int sub_2 = arith.sub(sub_1, 2);
		arith.mul(sub_2, 2);
	}
}
