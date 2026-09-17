/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc=new Scanner(System.in);
		System.out.println("====================================");
		System.out.println("WELCOME RESTAURANT OWNER!");
		System.out.println("====================================");
		System.out.println();
		System.out.println("What is the name for your restaurant?");
		String text=sc.nextLine();
		System.out.println("What is your name?");
		String text1=sc.nextLine();
		System.out.println("Great to see you, "+text1+"!"+" Let's set up a menu for "+text+"!");
		System.out.println("Tonight's menu has room for exactly 3 items. Let's go!");
		System.out.println();
		System.out.println("---Item #1---");
		System.out.println("Item name: ");
		String text2=sc.nextLine();
		System.out.println("Price of "+text2+"($): ");
		double num=sc.nextDouble();
		System.out.println("How many "+text2+" would you like?");
		int num1=sc.nextInt();
		System.out.print("Added "+num1+"x "+text2+" to your order! ");
		System.out.println("("+num*num1+")");
		double number00=num*num1;
		sc.nextLine();
		System.out.println("---Item #2---");
		System.out.println("Item name: ");
		String text3=sc.nextLine();
		System.out.println("Price of "+text3+"($): ");
		double num2=sc.nextDouble();
		System.out.println("How many "+text3+" would you like?");
		int num3=sc.nextInt();
		System.out.print("Added "+num3+"x "+text3+" to your order! ");
		System.out.println("("+num2*num3+")");
		double number0=num2*num3;
		sc.nextLine();
		System.out.println("---Item #3---");
		System.out.println("Item name:");
		String text4=sc.nextLine();
		System.out.println("Price of "+text4+"($):");
		double num4=sc.nextDouble();
		System.out.println("How many "+text4+" would you like?");
		int num5=sc.nextInt();
		System.out.print("Added "+num5+"x "+text4+" to your order! ");
		System.out.println("("+num4*num5+")");
		double number=num4*num5;
		System.out.println("Nice choices! What tip percentage would you like to leave? (ex: 15, 18,20):");
		double text5=sc.nextDouble();
		double total=number00+number0+number;
		double alldone=total*0.0975;
		System.out.println("=================================================");
		System.out.println("            "+text+" - Menu For Today");
		System.out.println("=================================================");
		System.out.println("Owner: "+text1);
		System.out.println("-------------------------------------------------");
		System.out.println("Item          Qty      Price");
		System.out.println("-------------------------------------------------");
		System.out.println(text2+"         "+num1+"     "+number00);
		System.out.println(text3+"          "+num3+"     "+number0);
		System.out.println(text4+"         "+num5+"     "+number);
		System.out.println("-------------------------------------------------");
		System.out.println("Subtotal:         "+total);
		System.out.println("Tax (9.75%):   "+alldone);
		System.out.println("Tip:              "+text5);
		double done=text5/100*total;
		System.out.println("Tip Amount:       "+done);
		System.out.println("=================================================");
		System.out.println("TOTAL:            "+(done+total+alldone));
		System.out.println("=================================================");
		System.out.println();
		System.out.println("Thanks for eating at "+text+"!");
		System.out.println("Come back soon -- we'll always have a byte for you!");
	}
}
