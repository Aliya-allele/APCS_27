/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Dog test = new Dog();
		test.setName("Juno");
		test.setAge(25);
		test.dogToString();
		System.out.println("Tori is a Chihuahua that is 1 year old.");
		test.isSleeping();
		test.bark();

	}
}
