package inheritance;

public class parent extends grandParent {
	
	public parent() {
		System.out.println("Welcome to parent class");
	}

	public int parentsum(int a, float b, char c) {
		int d = a+(int)b+c;
		System.out.println(" Entered character is : "+c+" and ASCII value is : "+(int)c);
		System.out.println(" Implicit & Explicit - parentSum value : "+d);
		return d;
	}
}
