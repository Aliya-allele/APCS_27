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
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String answer=sc.nextLine();
		if (answer.equalsIgnoreCase("wizard")){
			System.out.println("You've chosen the Wizard! Congrats!");
		}

		else if(answer.equalsIgnoreCase("warrior")){
			System.out.println("You've chosen the Warrior! Congrats!");
		}

		else if(answer.equalsIgnoreCase("rogue")){
			System.out.println("You've chosen the Rogue! Congrats!");
		}
		else if(!answer.equalsIgnoreCase("rogue")||!answer.equalsIgnoreCase("wizard")||answer.equalsIgnoreCase("warrior")){
			System.out.println("You didn't pick a character.");
		}
	
	}

}
