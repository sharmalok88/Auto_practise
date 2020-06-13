
public class Assignment_Constructor {
	
	public Assignment_Constructor() {
		this(10,20,30);
		System.out.println("Default Constructor");
	}
	
	public Assignment_Constructor(int a) {
		this();
		System.out.println("One Parameterised Constructor");
	}
	
	public Assignment_Constructor(int a, int b) {
		this(10);
		System.out.println("Two Parameterised Constructor");
	}
	
	public Assignment_Constructor(int a, int b, int c) {
		System.out.println("Three Parameterised Constructor");
	}

	public static void main(String[] args) {
		Assignment_Constructor ref = new Assignment_Constructor(10,20);

	}

}
