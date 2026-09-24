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
		int number=(int)(Math.random()*3+1);
		System.out.println("The goal of the game is to guess a word with two hints!");
		System.out.println();
		System.out.println("It's an electronic device!");
		System.out.print("What is your guess? ");
		String guess1=sc.nextLine();
		System.out.println();
		
		
	}
}
