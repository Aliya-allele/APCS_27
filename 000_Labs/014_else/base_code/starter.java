/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc=new Scanner(System.in);
		System.out.print("Pick a number between 1 - 1000: ");
		int number=sc.nextInt();
		int answer=(int)(Math.random()*1000+1);
		if (number==answer){
			System.out.println("You got it!! The number was "+answer+".");
		}
		else{
			System.out.println("Your number wasn't the random number. The number was "+answer+".");
		}
	}
}
