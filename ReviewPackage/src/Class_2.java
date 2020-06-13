
public class Class_2 {
	
	int c,d,mul;

	public int sum(int a,int b) {
		int c = a+b;
		return c;
		
	}
	public int subtract(int a,int b) {
		int d = a-b;
		return d;
		
	}
	
	public void multiplication(int c, int d) {
		int mul = c*d; 	
		System.out.println("Multiplication :"+mul);
		
	}
	public static void main(String[] args) {
		
		Class_2 ref= new Class_2();
		int sum_result =ref.sum(10, 2);
		System.out.println("Sum :"+sum_result);
		int sub_result = ref.subtract(10, 2);
		System.out.println("Subtract :"+sub_result);
		ref.multiplication(sum_result,sub_result);
		
	
		

	}

}
