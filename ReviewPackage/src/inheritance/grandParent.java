package inheritance;

public class grandParent {
	
	public grandParent() {
		System.out.println("Welcome to grandParent class");
	}
	
	public float sumFloat(int a, float b) {
		float c = a+b;
		System.out.println(" Implicit Conversion - Value after sum in float is : "+c);
		return c;
	}
	
	public int sumInt(int a, float b) {
		int c = a+(int)b;
		System.out.println(" Explicit Conversion - Value after sum in int is : "+c);
		return c;
	}

}
