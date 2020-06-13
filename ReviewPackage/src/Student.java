
public class Student {
	
	int age;
	int roll_no;
	
	public void method1()
	{
		System.out.println("Welcome ALL");
	}
	
	public void method2()
	{
		System.out.println("Automation is very easy");
	}

	public static void main(String[] args) {
		Student Deepak = new Student();
		
		Deepak.age = 18;
		System.out.println("Age is :"+Deepak.age);
		Deepak.roll_no = 67;
		System.out.println("Roll_no is :"+Deepak.roll_no);
		Deepak.method1();
		Deepak.method2();

	}

}
