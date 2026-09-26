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
		if (number==1){
			System.out.println("Hint number one, its an electronic device!");
			String guess1=sc.nextLine();
	
		if (guess1.equals("Phone")||guess1.equals("phone")){
			System.out.println();
			System.out.println("You guessed it!!");
		}
		else{
			System.out.println("Thats not the right answer. Your second hint is that it is small and rectangular.");
			guess1=sc.nextLine();
		}
		if(guess1.equals("Phone")||guess1.equals("phone")){
			System.out.println();
			System.out.println("Correct!!");
		}
		else{
			System.out.println("Close, the correct word was phone/Phone.");
		}
		}
		if (number==2){
			System.out.println("Here's hint number one! Its where people sleep on.");
			String guess2=sc.nextLine();

			if (guess2.equals("Bed")||guess2.equals("bed")){
				System.out.println();
				System.out.println("You guessed it!!");
			}
			else{
				System.out.println("Close! Here's hint number 2. It's in your room and has a pillow on it.");
				guess2=sc.nextLine();
			}
			if (guess2.equals("Bed")||guess2.equals("bed")){
				System.out.println();
				System.out.println("You got it!!");
			}
			else{
				System.out.println("So close! The answer was Bed/bed.");
			}
		}
		if (number==3){
			System.out.println("Here's hint number one! It's tall and has green leaves.");
			String guess3=sc.nextLine();

			if (guess3.equals("Tree")||guess3.equals("tree")){
				System.out.println();
				System.out.println("You guessed it!!");
			}
			else{
				System.out.println("Close! Here's hint number 2. Bark grows on it.");
				guess3=sc.nextLine();
			}
			if (guess3.equals("Tree")||guess3.equals("tree")){
				System.out.println();
				System.out.println("You got it!!");
			}
			else{
				System.out.println("So close! The answer was Tree/tree.");
			}
		}


		
	}
}
