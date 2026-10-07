/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc=new Scanner(System.in);
		int answer=(int)(Math.random()*1000+1);
		System.out.println("Welcome to the guessing game!");
		System.out.print("Please input a number: ");
		int guess=sc.nextInt();
		while(guess<answer){
			System.out.println("The number is higher.");
			System.out.print("Guess again: ");
			guess=sc.nextInt();
			if(guess>answer){
				System.out.println("The number is lower.");
				System.out.print("Guess again: ");
				guess=sc.nextInt();
			}
			if(guess==answer){
				break;
			}
		}
		System.out.println("You guessed it!");



		
	}
}
