/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter an integer:");
		int number=sc.nextInt();
		System.out.print("Please enter another integer:");
		int number2=sc.nextInt();
		System.out.println();
		if (number%3==0){
			System.out.println(number+" is divisible by 3!");
		}
		if (number%4==0){
			System.out.println(number+" is divisible by 4!");
		}
		if (number%5==0){
			System.out.println(number+" is divisible by 5!");
		}
		System.out.println();
		if (number2%3==0){
			System.out.println(number2+" is divisible by 3!");
		}
		if (number2%4==0){
			System.out.println(number2+" is divisible by 4!");
		}
		if (number2%5==0){
			System.out.println(number2+" is divisible by 5!");
		}
	}
}
