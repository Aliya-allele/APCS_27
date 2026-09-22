/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to the Fortune Cookie Generator!");
		System.out.println();
		System.out.print("Password: ");
		int number=(int)(Math.random()*11);
		System.out.println(number);
		if (number==0){
			System.out.print("Your relationships will prosper");
		}
		if (number==1){
			System.out.print("You'll soon recieve a large sum of money");
		}
		if (number==2){
			System.out.print("Kindness will open many doors for you");
		}
		if (number==3){
			System.out.print("You'll win the lotery");
		}
		if (number==4){
			System.out.print("You'll find a great opportunity soon");
		}
		if (number==5){
			System.out.print("")
		}
	}
}