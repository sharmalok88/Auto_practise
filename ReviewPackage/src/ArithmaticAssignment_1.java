
public class ArithmaticAssignment_1 {
	// ((((10+2)+2)-2)*2)/2)
	
	public int sum(int a, int b) {
		int c= a+b;
		System.out.println("Sum is :"+c);
		return c;
	}
	
	public int subtract(int a, int b) {
		int d= a-b;
		System.out.println("Subtract is :"+d);
		return d;
	}
	
	public int mul(int a, int b) {
		int e= a*b;
		System.out.println("Mul is :"+e);
		return e;
	}
	
	public void divide(int a, int b) {
		int f= a/b;
		System.out.println("Answer is :"+f);	
	}

	public static void main(String[] args) {
		ArithmaticAssignment_1 arith = new ArithmaticAssignment_1();
		int sum_1 = arith.sum(10, 2);
		int sum_2 = arith.sum(sum_1, 2);
		int sub = arith.subtract(sum_2, 2);
		int mul = arith.mul(sub, 2);
		arith.divide(mul, 2);
	}

}
