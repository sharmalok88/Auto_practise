package practise;

import java.util.Scanner;

public class prime {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b=0;
		System.out.print("number ");
		a = s.nextInt();
		
		for(int i=2;i<a-1;i++) {
			if(a%i == 0) {
				b=b+1;
			}
		}
		if(b>0) {
			System.out.println("NOT Prime");
		}
		else {
			System.out.println("prme");
		}
		}
	}


