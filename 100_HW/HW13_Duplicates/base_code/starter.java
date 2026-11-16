/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int []arr=new int[20];
		int y=0;
		int n=(int)(Math.random()*10+1);
		System.out.println("These are 20 random numbers:");
		for(int i=0;i<20;i++){
			int num=(int)(Math.random()*10+1);
			arr[y]=num;
			y++;
			System.out.print(arr[y-1]+" ");
		}
		System.out.println();
		System.out.println();
		System.out.println("A random number to look for is "+n);
		int duplicate=0;
		for(int z=0;z<20;z++){
			if(arr[z]==n){
				duplicate++;
				System.out.println("Duplicate found at index "+ z);
			}
		}
		System.out.println("Total number of duplicates: "+duplicate);
		System.out.println();
		for(int w=0; w<19;w++){
			if(arr[w]==arr[w+1]){
			System.out.println("Pair found at index "+w+" and "+(w+1)+", the number is "+arr[w]);
			}
		}
	}
}
