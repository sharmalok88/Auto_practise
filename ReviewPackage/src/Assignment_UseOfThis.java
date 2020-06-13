
public class Assignment_UseOfThis {
	
	public Assignment_UseOfThis() {
		this(10,20,30);
		System.out.println("Default Consructor");
	}
	
	public Assignment_UseOfThis(int a) {
		this();
		System.out.println("1 Parameterised Consructor");
	}
	
	public Assignment_UseOfThis(int a, int b) {
		this(10,20,30,40);
		System.out.println("2 Parameterised Consructor");
	}
	
	public Assignment_UseOfThis(int a, int b, int c) {
		System.out.println("3 Parameterised Consructor");
	}
	
	public Assignment_UseOfThis(int a, int b, int c, int d) {
		this(10);
		System.out.println("4 Parameterised Consructor");
	}

	public static void main(String[] args) {
		Assignment_UseOfThis ref = new Assignment_UseOfThis(10,20);

	}

}
