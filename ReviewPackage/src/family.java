import java.util.Scanner;

public class family {

		 public static void main(String args[])
		    {
		       int rows, number = 1, counter, j;
		       //To get the user's input
		       Scanner input = new Scanner(System.in);
		       System.out.println("Enter the number of rows for floyd's triangle:");
		       //Copying user input into an integer variable named rows
		       rows = input.nextInt();
		       System.out.println("Floyd's triangle");
		       System.out.println("****************");
		       for ( counter = 1 ; counter <= rows ; counter++ )
		       {System.out.println("counter value :"+counter);
		           for ( j = 1 ; j <= counter ; j++ )
		           {
		                System.out.print(number+" ");
		                //Incrementing the number value
		                number++;
		                System.out.println("number :"+number);
		                System.out.println("J value :"+j);
		           }
		           //For new line
		           System.out.println();
		       }
		   }
	}


