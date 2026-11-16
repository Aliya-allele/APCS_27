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
		int y=(int)(Math.random()*150+51);
		int []arr=new int[y];
		int min=Integer.MAX_VALUE;
		int max=0;
		int avg=0;
		int huh=0;
		int number=(int)(Math.random()*100+1);
		int i=0;
		for(i=0;i<y;i++){
			number=(int)(Math.random()*100+1);
			arr[i]=number;
			if(arr[i]<min){
				min=arr[i];
			}
		}
		for(int q=0;q<y;q++){
			if(arr[q]>max){
				max=arr[q];
			}
		}
		for (int num=0;num<y;num++){
			System.out.println(arr[num]);
		}
		for(int idk=0;idk<y;idk++){
			huh+=arr[idk];
			avg=huh/y;
		}
		System.out.println("Min: "+min);
		System.out.println("Max: "+max);
		System.out.println("Avergare: "+avg);
		
	}
}
