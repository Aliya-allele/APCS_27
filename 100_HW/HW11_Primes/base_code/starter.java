/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static boolean checkPrimes(int one){
		if(one<=1){
			return false;
		}if (one==2){
			return true;
		}
		int nummer=2;
		if(one%2==0){
			return false;
		}while(nummer<one){
			if(one%nummer==0)
			return false;
			nummer++;
		}
		return true;
	}
	public static void printPrimes(int two){
		int num=2;
		while(num!=two){
			if(checkPrimes(num)){
			System.out.println(num);
			}num++;
		}
			
		}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input a number to see the prime numbers until that number: ");
		int number=sc.nextInt();
		printPrimes(number);
		sc.nextLine();
		
	}
}
