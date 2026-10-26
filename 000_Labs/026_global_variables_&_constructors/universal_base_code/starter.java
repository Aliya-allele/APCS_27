/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BankAccount one = new BankAccount(192003746,725.68,"BMO","Goliath");
		BankAccount two = new BankAccount(123456789,154.87,"Chase","Jayden");
		BankAccount three = new BankAccount(987654321,874.51,"Wells Fargo","Ashley");
		BankAccount four = new BankAccount(182739465,345.72,"Bank of America","Nisha");
		one.printDetails();
		two.printDetails();
		three.printDetails();
		four.printDetails();

		
	}
}
