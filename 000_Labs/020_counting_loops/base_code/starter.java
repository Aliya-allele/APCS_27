/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc=new Scanner(System.in);
		int amount=0;
		System.out.print("Input your name-");
		String name=sc.nextLine();
		System.out.print("How many times would you like your name to be printed out-");
		int number=sc.nextInt();
		while(true){
			if (amount==number){
				break;
			}
			System.out.println(name);
			amount=amount+1;
		}



		
	}
}
