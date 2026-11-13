/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		int arr[]=new int[10];
		int y=10;
		int x=0;
		while(x<10){
			arr[x]=arr[x]+(y-1);
			y--;
		    System.out.println(arr[x]);
			x++;
		}


		
	}
}
