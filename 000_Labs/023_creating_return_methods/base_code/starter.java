/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static int pow(int base,int exponent){
		int mult=0;
		int answer=1;
		while(mult!=exponent){
			answer=answer*base;
			mult=mult+1;
		}
		System.out.println("Your total is "+answer);
		return answer;
		}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input one number (integer) - ");
		int num1=sc.nextInt();
		System.out.print("Input another number (integer) - ");
		int num2=sc.nextInt();
		pow(num1,num2);
		



		
	}
}
