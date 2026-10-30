package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String actor;		// What's the actors name?
	int age;			// What's the age of the actor?
	String villain;		// Who's the arch nemesis of this Spiderman?

	public Spiderman(){
		String actor="unknown";
		int age=0;
		String villain="unknown";
	}
	public Spiderman(String acting){
		actor=acting;
		age=0;
		villain="unknown";
	}
	public Spiderman(int aging){
		actor="unknown";
		age=aging;
		villain="unknown";
	}
	public Spiderman(String acting,int aging){
		actor=acting;
		age=aging;
		villain="unknown";
	}
	public Spiderman(String acting, int aging, String fighting){
		actor=acting;
		age=aging;
		villain=fighting;
	}
	// Create constructors for each combination of actor/age/villain. Use the defaults above if not an input parameter.
	// Default constructor! 				Actor - Unknown, Age - 0, Villain - Unknown
	// String Actor constructor! 			Age - 0, Villain Unknown 
	// int Age constructor! 				Actor - Unknown, Villain Unknown
	// String Actor, int Age constructor! 	Villain Unknown
	// String Actor, int Age, String Villain constructor!		
	
	// ---------------------------------------
	// Create accessor and mutator methods for actor, age, and villain (6 total methods)
	// Ex: getAge and setAge
	public String getActor(){
		return actor;
	}
	public int getAge(){
		return age;
	}
	public String getVillain(){
		return villain;
	}
	public void setActor(String name){
		actor=name;
	}
	public void setAge(int num){
		age=num;

	}
	public void setVillain(String name2){
		villain=name2;
	}
	public void SpidermanToString(){
		System.out.println("Spidermans name is "+actor+", they are "+age+" years old, and they are fighting against "+villain+".");
	}
	


	// ---------------------------------------
	public void fight(){
		System.out.println("Spidey shoots his web at " + villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}
}
