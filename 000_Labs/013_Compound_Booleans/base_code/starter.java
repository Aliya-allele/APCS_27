/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.print("Please enter your first number: "); 
		int number1=sc.nextInt();
	
		System.out.print("Please enter your second number: ");
		int number2=sc.nextInt();
		
		System.out.print("Please enter your third number: ");
		int number3=sc.nextInt();
		if (number1>number2&&number1>number3){
			System.out.println("Your first number is the largest of the three!");
			System.out.println("The number was "+number1+".");
		}
		if (number2>number1&&number2>number3){
			System.out.println("Your second number is the largest of the three!");
			System.out.println("The number was "+number2+".");
		}
		if (number3>number1&&number3>number2){
			System.out.println("Your third number is the largest of the three!");
			System.out.println("The number was "+number3+".");
		}
		if (number1<number2&&number1<number3){
			System.out.println("Your first number is the smallest of the three!");
			System.out.println("The number was "+number1+".");
		}
		if (number2<number1&&number2<number3){
			System.out.println("Your second number is the smallest of the three!");
			System.out.println("The number was "+number2+".");
		}
		if (number3<number1&&number3<number2){
			System.out.println("Your third number is the smallest of the three!");
			System.out.println("The number was "+number3+".");
		}

	}
}
