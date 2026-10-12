/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int money=100;
		int moneyleft=100;
		System.out.println("1. Each player starts with $100."); 
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("   a. If two numbers match, you double your money.");
		System.out.println("   b. If three numbers math, you triple your money.");
		System.out.println("   c. If none match, you lose your money.");
		System.out.println("------------------------------------------------------");
		System.out.println();
		System.out.println("Would you like to play the slots? (Yes/yes/Y/y)");
		String answer=sc.nextLine();
		while (true){
		if((answer.equalsIgnoreCase("yes"))||(answer.equalsIgnoreCase("y"))){

			System.out.println("You have $"+moneyleft+". How much would you like to wager?");
		    money=sc.nextInt();
			int amount=(int)(Math.random()*10);
			int amount2=(int)(Math.random()*10);
			int amount3=(int)(Math.random()*10);
             sc.nextLine();
			if(money<=moneyleft){
				System.out.println();
				System.out.println("Great! Let's play!!!");
				System.out.println("Your rolls are:");
				System.out.println("____________________");
				System.out.println(amount+" | "+amount2+" | "+amount3);
				System.out.println("---------------------");
				if((amount==amount2)||(amount==amount3)||(amount2==amount3)){
					System.out.println("You won!! Your wager has now been doubled.");
					System.out.println("You now have $"+((moneyleft-money)+money*2));
					moneyleft=(moneyleft-money)+money*2;
					System.out.println("Would you like to play again? (Yes/yes/Y/y):");
					answer=sc.nextLine();
				}else if((amount==amount2)&&(amount==amount3)&&(amount2==amount3)){
					System.out.println("You hit the jackpot!! Your wager has now been tripled.");
					System.out.println("You now have $"+((moneyleft-money)+money*3));
					moneyleft=((moneyleft-money)+money*3);
					System.out.println("Would you like to play again? (Yes/yes/Y/y):");
					answer=sc.nextLine();
				}
				else if(moneyleft>0){
					System.out.println("You didnt win this time, better luck next time!");
					System.out.println("You now have $"+(moneyleft-money));
					moneyleft=moneyleft-money;
					System.out.println("Would you like to play again? (Yes/yes/Y/y):");
					answer=sc.nextLine();
				}
			if(moneyleft<=0){
					System.out.println("Too bad you have no money left. Try again.");
					break;
			}}
		}while((!answer.equalsIgnoreCase("no"))&&(!answer.equalsIgnoreCase("yes"))&&(!answer.equalsIgnoreCase("y"))){
			System.out.print("That wasn't quite clear.");
			answer=sc.nextLine();
		}
		if((!answer.equalsIgnoreCase("yes"))&&(!answer.equalsIgnoreCase("y"))){
					System.out.println("Oh well. See you next time! You have $"+moneyleft+".");
					break;
				}
			}
	}
}
