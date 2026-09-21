/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers to create a range for your random number");
		System.out.println("Please enter an integer:");
		int number1=sc.nextInt();
		System.out.println("Please enter another integer (bigger than the first):");
		int number2=sc.nextInt();
		System.out.println();
		System.out.println("Your range is "+number1+" to "+number2);
		System.out.println("Here are 5 numbers generated in that range.");
		int difference=number2-number1;
		int a=(int)(Math.random()*difference+number1);
		int b=(int)(Math.random()*difference+number1);
		int c=(int)(Math.random()*difference+number1);
		int d=(int)(Math.random()*difference+number1);
		int e=(int)(Math.random()*difference+number1);
		
		System.out.println(a+","+b+","+c+","+d+","+e);

	}
}
