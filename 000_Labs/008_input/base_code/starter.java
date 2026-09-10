/*
 *	Author:  
 *  Date: 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	Scanner sc=new Scanner(System.in);
	
	System.out.print("Enter your name-");
	String text=sc.nextLine();

System.out.print("Enter your age-");
int number=sc.nextInt();

System.out.print("What month were you born-");
int num2=sc.nextInt();

System.out.print("What day were you born-");
int num3=sc.nextInt();

System.out.print("What year were you born-");
int num4=sc.nextInt();

System.out.println("My name is "+text+", im "+number+" years old and I was born on "+num2+"/"+num3+"/"+num4+".");
	}
}
