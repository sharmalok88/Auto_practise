
public class Constructor {
	
	int a,b,c,d,e;
	public Constructor(int a1, int a2, int a3, int a4, int a5) {
		a = a1;
		b = a2;
		c = a3;
		d = a4; 
		e = a5;
	}

	public static void main(String[] args) {
		Constructor ref = new Constructor(10, 20, 30, 40, 50);
		System.out.println("Print values :"+ref.a+" "+ref.b+" "+ref.c+" "+ref.d+" "+ref.e);

	}

}
