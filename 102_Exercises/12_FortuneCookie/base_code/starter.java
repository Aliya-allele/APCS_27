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
			System.out.println("Your relationships will prosper");
		}
		if (number==1){
			System.out.println("You'll soon recieve a large sum of money");
		}
		if (number==2){
			System.out.println("Kindness will open many doors for you");
		}
		if (number==3){
			System.out.println("You'll win the lotery");
		}
		if (number==4){
			System.out.println("You'll find a great opportunity soon");
		}
		if (number==5){
			System.out.println("There is still time.");
		}
		if (number==6){
			System.out.println("You always have a choice");
		}
		if (number==7){
			System.out.println("A solution will appear when you need it most");
		}
		if (number==8){
			System.out.println("Remeber to make time for yourself");
		}
		if (number==9){
			System.out.println("You don't owe anyone anything");
		}
	}
}