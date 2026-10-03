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
		System.out.println("What is your name?"); 
		String name=sc.nextLine();
		System.out.println("What is your title? Ex: Slayer of Dragons");
		String title=sc.nextLine();
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String answer=sc.nextLine();
		if (answer.equalsIgnoreCase("wizard")||answer.equalsIgnoreCase("warrior")||answer.equalsIgnoreCase("rogue")){
			System.out.println();
		System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely.");
		System.out.println();
		System.out.println("Strength (1-10):");
		int strength=sc.nextInt();
		int points=20-strength;
			if (strength>10){
			System.out.println("Please choose number under 10.");
			strength=sc.nextInt();
			points=20-strength;
			System.out.println("You have "+(20-strength)+" points left to spend");
		}
		else if(points<0){
			System.out.println("Not enough points left, please choose a lower number.");
			strength=sc.nextInt();
			System.out.println("You have "+(20-strength)+" left to spend.");
		}else{
		System.out.println("You have "+(20-strength)+" left to spend.");
		}
		System.out.println();
		System.out.println("Dexterity (1-10):");
		int dexterity=sc.nextInt();
		int points2=points-dexterity;
		if (dexterity>10){
			System.out.println("Please choose number under 10.");
			dexterity=sc.nextInt();
			points2=points-dexterity;
			System.out.println("You have "+(points-dexterity)+" left to spend");
		}else if(points2<0){
			System.out.println("Not enough points left, please choose a lower number.");
			dexterity=sc.nextInt();
			points2=points-dexterity;
			System.out.println("You have "+(points-dexterity)+" left to spend");
		}else{
			points2=points-dexterity;
			System.out.println("You have "+(points-dexterity)+" left to spend.");
		}
		System.out.println("Intelligence (1-10):");
		int intelligence=sc.nextInt();
		int points3=points2-intelligence;
		if (intelligence>10){
			System.out.println("Please choose number under 10.");
			intelligence=sc.nextInt();
			points3=points2-intelligence;
			System.out.println("You have "+(points2-intelligence)+" left to spend");
		}
		else if(points3<0){
			System.out.println("Not enough points left, please choose a lower number.");
			intelligence=sc.nextInt();
			points3=points2-intelligence;
			System.out.println("You have "+(points2-intelligence)+" left to spend");
		}else{
			points3=points2-intelligence;
		System.out.println("You have "+(points2-intelligence)+ " left to spend.");
		}
		System.out.println();
		System.out.println("Charisma (1-10):");
		int charisma=sc.nextInt();
		int points4=points3-charisma;
		if (charisma>10){
			System.out.println("Please choose  lower number.");
			charisma=sc.nextInt();
			points4=points3-charisma;
			System.out.println("You have "+(points3-charisma)+" left to spend");
		}
		else if(points4<0){
			System.out.println("Not enough points left, please choose a lower number.");
			charisma=sc.nextInt();
			points4=points3-charisma;
			System.out.println("You have "+(points3-charisma)+" left to spend");
		}else{
			points4=points3-charisma;
		System.out.println("You have "+(points3-charisma)+ " left to spend.");
		}
		System.out.println();
		System.out.println("You are "+name+", the "+title+" of CVHS");
		System.out.println("Strength - "+strength);
		System.out.println("Dexterity - "+dexterity);
		System.out.println("Intelligence - "+intelligence);
		System.out.println("Charisma - "+charisma);
		System.out.println();
		System.out.println("Good luck on your quest "+name+"!");
		}
		else if(!answer.equalsIgnoreCase("rogue")||!answer.equalsIgnoreCase("wizard")||answer.equalsIgnoreCase("warrior")){
			System.out.println("You didn't pick a charcter.");
			System.out.println();
		System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely.");
		System.out.println();
		System.out.println("Strength (1-10):");
		int strength=sc.nextInt();
		int points=20-strength;
			if (strength>10){
			System.out.println("Please choose number under 10.");
			strength=sc.nextInt();
			points=20-strength;
			System.out.println("You have "+(20-strength)+" points left to spend");
		}
		else if(points<0){
			System.out.println("Not enough points left, please choose a lower number.");
			strength=sc.nextInt();
			System.out.println("You have "+(20-strength)+" left to spend.");
		}else{
		System.out.println("You have "+(20-strength)+" left to spend.");
		}
		System.out.println();
		System.out.println("Dexterity (1-10):");
		int dexterity=sc.nextInt();
		int points2=points-dexterity;
		if (dexterity>10){
			System.out.println("Please choose number under 10.");
			dexterity=sc.nextInt();
			points2=points-dexterity;
			System.out.println("You have "+(points-dexterity)+" left to spend");
		}else if(points2<0){
			System.out.println("Not enough points left, please choose a lower number.");
			dexterity=sc.nextInt();
			points2=points-dexterity;
			System.out.println("You have "+(points-dexterity)+" left to spend");
		}else{
			points2=points-dexterity;
			System.out.println("You have "+(points-dexterity)+" left to spend.");
		}
		System.out.println("Intelligence (1-10):");
		int intelligence=sc.nextInt();
		int points3=points2-intelligence;
		if (intelligence>10){
			System.out.println("Please choose number under 10.");
			intelligence=sc.nextInt();
			points3=points2-intelligence;
			System.out.println("You have "+(points2-intelligence)+" left to spend");
		}
		else if(points3<0){
			System.out.println("Not enough points left, please choose a lower number.");
			intelligence=sc.nextInt();
			points3=points2-intelligence;
			System.out.println("You have "+(points2-intelligence)+" left to spend");
		}else{
			points3=points2-intelligence;
		System.out.println("You have "+(points2-intelligence)+ " left to spend.");
		}
		System.out.println();
		System.out.println("Charisma (1-10):");
		int charisma=sc.nextInt();
		int points4=points3-charisma;
		if (charisma>10){
			System.out.println("Please choose  lower number.");
			charisma=sc.nextInt();
			points4=points3-charisma;
			System.out.println("You have "+(points3-charisma)+" left to spend");
		}
		else if(points4<0){
			System.out.println("Not enough points left, please choose a lower number.");
			charisma=sc.nextInt();
			points4=points3-charisma;
			System.out.println("You have "+(points3-charisma)+" left to spend");
		}else{
			points4=points3-charisma;
		System.out.println("You have "+(points3-charisma)+ " left to spend.");
		}
		System.out.println();
		System.out.println("You are "+name+", the "+title+" of CVHS");
		System.out.println("Strength - "+strength);
		System.out.println("Dexterity - "+dexterity);
		System.out.println("Intelligence - "+intelligence);
		System.out.println("Charisma - "+charisma);
		System.out.println();
		System.out.println("Good luck on your quest "+name+"!");
		}
	}
}
