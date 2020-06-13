
public class class_1 {

	int a=2;
	public void method1() {
		System.out.println("We are in Method1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("we are in Main Method");
		
		class_1 ref = new class_1();
		
		System.out.println("Value of a is :" +ref.a);
		
		ref.a=125;
		System.out.println("Value of a for second time is :" +ref.a);
		
	
		System.out.println("Value of a for third time is :" +ref.a);
		
	}

}
