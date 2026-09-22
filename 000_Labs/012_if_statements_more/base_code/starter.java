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
		System.out.println("Please input your first number: ");
		int num=sc.nextInt();
		System.out.println();
		System.out.println("Please input your second number: ");
		int mun=sc.nextInt();
		System.out.println();

		if (num!=mun){
			System.out.println("Your numbers are different!");

		}
		if (num==mun){
			System.out.println("Your numbers are the same!");

		}

	}
}
